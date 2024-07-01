package eus.onekin.portfolioscan.etl.load;

import eus.onekin.portfolioscan.etl.load.config.LoaderSetup;
import eus.onekin.portfolioscan.etl.load.loader.exception.InfluxConnectionError;

public interface MainLoader {

    LoaderSetup setup() throws InfluxConnectionError;

    void closeConnection();
}
