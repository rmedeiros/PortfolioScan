package eus.onekin.portfolioscan.etl.load.loader;

import eus.onekin.portfolioscan.etl.load.MainLoader;
import eus.onekin.portfolioscan.etl.load.config.LoaderSetup;
import eus.onekin.portfolioscan.etl.load.loader.exception.InfluxConnectionError;

public class InfluxDBLoader implements MainLoader {

    private InfluxDBClientInstance influxClient;


    @Override
    public LoaderSetup setup() throws InfluxConnectionError {
        influxClient = new InfluxDBClientInstance();

        LoaderSetup loaderSetup = new LoaderSetup();
        loaderSetup.getTransformedProjectListeners().add(new ProjectDataLoader(influxClient));
        loaderSetup.getFeaturesTransformedListeners().add(new FeatureDataLoader(influxClient));
        loaderSetup.getVariantModelTransformedListeners().add(new VariantModelDataLoader(influxClient));
        loaderSetup.getFeatureModelTransformedListeners().add(new FeatureModelDataLoader(influxClient));
        loaderSetup.getAttributesTransformedListeners().add(new AttributeDataLoader(influxClient));
        loaderSetup.getConfigSpaceTransformedListeners().add(new ConfigSpaceDataLoader(influxClient));
        return loaderSetup;
    }

    @Override
    public void closeConnection() {
        influxClient.getClient().close();
    }


}