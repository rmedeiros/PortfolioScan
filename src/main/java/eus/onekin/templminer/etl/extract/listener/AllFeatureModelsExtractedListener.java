package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.AllFeatureModelsExtractedEvent;

public interface AllFeatureModelsExtractedListener {


    void onAllFeatureModelsExtracted(
            AllFeatureModelsExtractedEvent allFeatureModelsExtractedEvent);
}
