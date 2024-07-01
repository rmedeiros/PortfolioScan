package eus.onekin.portfolioscan.etl.load.loader;

import com.influxdb.client.domain.WritePrecision;
import eus.onekin.portfolioscan.etl.transform.event.ConfigSpaceTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.ConfigSpaceTransformedListener;

public class ConfigSpaceDataLoader implements ConfigSpaceTransformedListener {

    private final InfluxDBClientInstance influxDBClient;

    public ConfigSpaceDataLoader(InfluxDBClientInstance influxDBClient) {
        this.influxDBClient = influxDBClient;
    }

    @Override
    public void onConfigSpaceTransformed(ConfigSpaceTransformedEvent event) {
        influxDBClient.getApiWriter().writeMeasurement(WritePrecision.S, event.getMeasurement());
    }


}
