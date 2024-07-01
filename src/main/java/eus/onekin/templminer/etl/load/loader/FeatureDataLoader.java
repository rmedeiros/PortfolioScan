package eus.onekin.portfolioscan.etl.load.loader;

import com.influxdb.client.domain.WritePrecision;
import eus.onekin.portfolioscan.etl.transform.event.FeatureTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.FeaturesTransformedListener;

public class FeatureDataLoader implements FeaturesTransformedListener {

    private final InfluxDBClientInstance influxDBClient;

    public FeatureDataLoader(InfluxDBClientInstance influxDBClient) {
        this.influxDBClient = influxDBClient;
    }

    @Override
    public void onfFeatureTransformed(FeatureTransformedEvent featureTransformedEvent) {
            influxDBClient.getApiWriter()
                    .writeMeasurement(WritePrecision.S, featureTransformedEvent.getFeatureMeasurement());


    }
}
