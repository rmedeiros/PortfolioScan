package eus.onekin.portfolioscan.etl.transform.event;

import eus.onekin.portfolioscan.etl.load.model.FeatureMeasurement;


public class FeatureTransformedEvent {


    private FeatureMeasurement featureMeasurement;

    public FeatureTransformedEvent(FeatureMeasurement featureMeasurement) {
        this.featureMeasurement = featureMeasurement;
    }

    public FeatureTransformedEvent() {
    }

    public FeatureMeasurement getFeatureMeasurement() {
        return featureMeasurement;
    }

    public void setFeatureMeasurement(
            FeatureMeasurement featureMeasurement) {
        this.featureMeasurement = featureMeasurement;
    }
}
