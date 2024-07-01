package eus.onekin.portfolioscan.etl.transform.event;

import eus.onekin.portfolioscan.etl.load.model.VariantModelMeasurement;

public class VariantModelTransformedEvent {
    private VariantModelMeasurement variantModelMeasurement;

    public VariantModelTransformedEvent(VariantModelMeasurement variantModelMeasurement) {
        this.variantModelMeasurement = variantModelMeasurement;
    }

    public void setVariantModelMeasurement(VariantModelMeasurement variantModelMeasurement) {
        this.variantModelMeasurement = variantModelMeasurement;
    }

    public VariantModelMeasurement getVariantModelMeasurement() {
        return this.variantModelMeasurement;
    }
}
