package eus.onekin.portfolioscan.etl;


import eus.onekin.portfolioscan.etl.extract.MainExtractor;


import eus.onekin.portfolioscan.etl.extract.exception.ExtractorNotSetUpError;
import eus.onekin.portfolioscan.etl.load.MainLoader;
import eus.onekin.portfolioscan.etl.load.config.LoaderSetup;
import eus.onekin.portfolioscan.etl.load.loader.InfluxDBLoader;
import eus.onekin.portfolioscan.etl.load.loader.exception.InfluxConnectionError;
import eus.onekin.portfolioscan.etl.transform.MainTransformer;
import eus.onekin.portfolioscan.etl.transform.config.TransformerSetup;

import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws ExtractorNotSetUpError, InfluxConnectionError, IOException, ParseException {

        MainExtractor extractor = null; //new YourExtractorImplementation();
        MainTransformer transformer = new MainTransformer();
        MainLoader mainLoader = new InfluxDBLoader();
        LoaderSetup loaderSetup = mainLoader.setup();
        TransformerSetup transformerSetup = transformer.setup(loaderSetup);
        extractor.setup(transformerSetup);

        extractor.extract();
        mainLoader.closeConnection();
    }
}