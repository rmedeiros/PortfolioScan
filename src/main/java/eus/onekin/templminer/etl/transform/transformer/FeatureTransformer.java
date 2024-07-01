package eus.onekin.portfolioscan.etl.transform.transformer;

import eus.onekin.portfolioscan.etl.extract.event.FeatureExtractedEvent;
import eus.onekin.portfolioscan.etl.extract.listener.FeatureExtractedEventListener;
import eus.onekin.portfolioscan.etl.load.model.FeatureMeasurement;
import eus.onekin.portfolioscan.etl.transform.event.FeatureTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.FeaturesTransformedListener;

import java.util.List;

public class FeatureTransformer implements FeatureExtractedEventListener {


    private final List<FeaturesTransformedListener> listeners;

    public FeatureTransformer(
            List<FeaturesTransformedListener> featuresTransformedListener) {
        this.listeners = featuresTransformedListener;
    }
    @Override
    public void onFeatureExtractedEvent(FeatureExtractedEvent featureExtractedEvent) {
        FeatureMeasurement measurement =  new FeatureMeasurement(featureExtractedEvent.getId());
        measurement.setName(featureExtractedEvent.getName());
        measurement.setFeatureModelId(featureExtractedEvent.getFeatureModelId());
        measurement.setProjectId(featureExtractedEvent.getProject().getId());
        measurement.setProjectName(featureExtractedEvent.getProject().getName());
        measurement.setNumberOfAttributes(featureExtractedEvent.getNumberOfAttributes());
        measurement.setProductsSelectingIt(featureExtractedEvent.getProductsSelectingIt());
        measurement.setVersionName(featureExtractedEvent.getVersion().getName());
        measurement.setVersionTimeStamp(featureExtractedEvent.getVersion().getCreated());
        for(FeaturesTransformedListener listener: listeners){
            listener.onfFeatureTransformed(new FeatureTransformedEvent(measurement));
        }
    }
}
