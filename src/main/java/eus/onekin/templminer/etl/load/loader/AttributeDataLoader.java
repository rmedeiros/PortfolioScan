package eus.onekin.portfolioscan.etl.load.loader;

import com.influxdb.client.domain.WritePrecision;
import eus.onekin.portfolioscan.etl.load.model.AttributeMeasurement;
import eus.onekin.portfolioscan.etl.transform.event.AttributesTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.AttributesTransformedListener;

public class AttributeDataLoader implements AttributesTransformedListener {

    private final InfluxDBClientInstance influxDBClient;

    public AttributeDataLoader(InfluxDBClientInstance influxDBClient) {
        this.influxDBClient = influxDBClient;
    }

    @Override
    public void onAttributesTransformed(AttributesTransformedEvent event) {
        for (AttributeMeasurement measurement : event.getAttributeMeasurementList()) {
            influxDBClient.getApiWriter()
                    .writeMeasurement(WritePrecision.S, measurement);

        }
    }
}
