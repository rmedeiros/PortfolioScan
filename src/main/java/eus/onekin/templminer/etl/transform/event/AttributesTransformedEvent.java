package eus.onekin.portfolioscan.etl.transform.event;

import eus.onekin.portfolioscan.etl.load.model.AttributeMeasurement;

import java.util.List;

public class AttributesTransformedEvent {

    private List<AttributeMeasurement> attributeMeasurementList;

    public AttributesTransformedEvent(List<AttributeMeasurement> attributeMeasurementList) {
        this.attributeMeasurementList = attributeMeasurementList;
    }
    

    public List<AttributeMeasurement> getAttributeMeasurementList() {
        return attributeMeasurementList;
    }

    public void setAttributeMeasurementList(
            List<AttributeMeasurement> attributeMeasurementList) {
        this.attributeMeasurementList = attributeMeasurementList;
    }
}
