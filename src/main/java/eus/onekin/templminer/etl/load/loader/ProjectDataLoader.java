package eus.onekin.portfolioscan.etl.load.loader;


import com.influxdb.client.domain.WritePrecision;
import eus.onekin.portfolioscan.etl.transform.event.ProjectTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.TransformedProjectListener;

public class ProjectDataLoader implements TransformedProjectListener {


    private final InfluxDBClientInstance influxDBClient;

    public ProjectDataLoader(InfluxDBClientInstance influxDBClient) {
        this.influxDBClient = influxDBClient;
    }

    @Override
    public void onProjectTransformed(ProjectTransformedEvent projectTransformedEvent) {
        influxDBClient.getApiWriter().writeMeasurement(WritePrecision.S, projectTransformedEvent.getProjectMeasurement());
    }
}
