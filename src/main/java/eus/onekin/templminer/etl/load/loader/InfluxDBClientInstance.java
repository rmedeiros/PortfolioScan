package eus.onekin.portfolioscan.etl.load.loader;

import java.io.IOException;
import java.util.Properties;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.WriteApiBlocking;
import eus.onekin.portfolioscan.etl.load.loader.exception.InfluxConnectionError;
import eus.onekin.portfolioscan.etl.utils.PropertiesLoader;

public class InfluxDBClientInstance {


    private final InfluxDBClient client;
    private final WriteApiBlocking apiWriter;

    public InfluxDBClientInstance() throws InfluxConnectionError {

        try {

            Properties conf = PropertiesLoader.loadProperties();

            // You can generate an API token from the "API Tokens Tab" in the UI
            String token = conf.getProperty("influx.api");
            String bucket = conf.getProperty("influx.bucket");

            this.client = InfluxDBClientFactory.create(conf.getProperty("influx.url"),
                    token.toCharArray(), conf.getProperty("influx.org"), bucket);
            this.apiWriter = client.getWriteApiBlocking();
        } catch (IOException e) {
            throw new InfluxConnectionError(e.getMessage());
        }
    }

    public InfluxDBClient getClient() {
        return client;
    }

    public WriteApiBlocking getApiWriter() {
        return apiWriter;
    }
}