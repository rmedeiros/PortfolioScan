package eus.onekin.portfolioscan.etl.transform.transformer;

import eus.onekin.portfolioscan.etl.extract.event.FeatureModelExtractedEvent;
import eus.onekin.portfolioscan.etl.extract.listener.FeatureModelExtractedListener;
import eus.onekin.portfolioscan.etl.load.model.FeatureModelMeasurement;
import eus.onekin.portfolioscan.etl.transform.event.FeatureModelTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.FeatureModelTransformedListener;

import java.util.List;

public class FeatureModelTransformer implements FeatureModelExtractedListener {

    private final List<FeatureModelTransformedListener> listeners;

    public FeatureModelTransformer(List<FeatureModelTransformedListener> listeners) {
        this.listeners = listeners;
    }

    @Override
    public void onFeatureModelExtracted(FeatureModelExtractedEvent event) {
        FeatureModelMeasurement featureModelMeasurement = new FeatureModelMeasurement();
        featureModelMeasurement.setName(event.getName());
        featureModelMeasurement.setId(event.getId());
        featureModelMeasurement.setFeatures(event.getFeatureIds());
        featureModelMeasurement.setElementCount(event.getElementCount());
        featureModelMeasurement.setFlexibilityRatio(event.getFlexibilityRatio());
        featureModelMeasurement.setFeaturesCount(event.getFeatureCount());
        featureModelMeasurement.setAttributeCount(event.getAttributeCount());
        featureModelMeasurement.setConstraintCount(event.getConstraintCount());

        featureModelMeasurement.setVersionTimeStamp(event.getVersion().getCreated());
        featureModelMeasurement.setVersionName(event.getVersion().getName());
        featureModelMeasurement.setProjectName(event.getProject().getName());
        featureModelMeasurement.setProjectId(event.getProject().getId());

        for (FeatureModelTransformedListener listener : listeners) {
            listener.onFeatureModelTransformed(new FeatureModelTransformedEvent(featureModelMeasurement));
        }
    }
}
