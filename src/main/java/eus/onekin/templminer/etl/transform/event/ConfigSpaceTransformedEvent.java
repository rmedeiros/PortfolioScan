package eus.onekin.portfolioscan.etl.transform.event;

import eus.onekin.portfolioscan.etl.load.model.ConfigSpaceMeasurement;

public class ConfigSpaceTransformedEvent {
    private ConfigSpaceMeasurement measurement;

    public ConfigSpaceTransformedEvent(ConfigSpaceMeasurement measurement) {
        this.measurement = measurement;
    }

    public ConfigSpaceMeasurement getMeasurement() {
        return measurement;
    }

}
