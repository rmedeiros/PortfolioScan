package eus.onekin.portfolioscan.etl.extract;

import eus.onekin.portfolioscan.etl.extract.exception.ExtractorNotSetUpError;
import eus.onekin.portfolioscan.etl.transform.config.TransformerSetup;

import java.io.IOException;
import java.text.ParseException;

public interface MainExtractor {

    void setup(TransformerSetup transformerSetup);

    void extract() throws ExtractorNotSetUpError, IOException, ParseException;

    void setup();
}
