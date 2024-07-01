package eus.onekin.portfolioscan.etl.load.loader;

import com.influxdb.client.domain.WritePrecision;
import eus.onekin.portfolioscan.etl.transform.event.FeatureModelTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.FeatureModelTransformedListener;


public class FeatureModelDataLoader implements FeatureModelTransformedListener {
    private final InfluxDBClientInstance influxClient;

    public FeatureModelDataLoader(InfluxDBClientInstance influxClient) {
        this.influxClient = influxClient;
    }

    @Override
    public void onFeatureModelTransformed(FeatureModelTransformedEvent event) {
        influxClient.getApiWriter().writeMeasurement(WritePrecision.S, event.getFeatureModelMeasurement());
    }
}
