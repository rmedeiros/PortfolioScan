package eus.onekin.portfolioscan.etl.load.loader;


import com.influxdb.client.domain.WritePrecision;
import eus.onekin.portfolioscan.etl.transform.event.VariantModelTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.VariantModelTransformedListener;

public class VariantModelDataLoader implements VariantModelTransformedListener {

    private final InfluxDBClientInstance influxDBClient;

    public VariantModelDataLoader(InfluxDBClientInstance influxDBClient) {
        this.influxDBClient = influxDBClient;
    }

    @Override
    public void onVariantModelTransformed(VariantModelTransformedEvent variantModelTransformedEvent) {
        influxDBClient.getApiWriter()
                .writeMeasurement(WritePrecision.S, variantModelTransformedEvent.getVariantModelMeasurement());
    }
}
