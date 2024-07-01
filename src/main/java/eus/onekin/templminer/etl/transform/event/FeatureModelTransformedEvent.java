package eus.onekin.portfolioscan.etl.transform.event;

import eus.onekin.portfolioscan.etl.load.model.FeatureModelMeasurement;

public class FeatureModelTransformedEvent {

    private FeatureModelMeasurement featureModelMeasurement;

    public FeatureModelTransformedEvent(FeatureModelMeasurement featureModelMeasurement) {
        this.featureModelMeasurement = featureModelMeasurement;
    }

    public FeatureModelMeasurement getFeatureModelMeasurement() {
        return featureModelMeasurement;
    }

    public void setFeatureModelMeasurement(FeatureModelMeasurement featureModelMeasurement) {
        this.featureModelMeasurement = featureModelMeasurement;
    }
}
