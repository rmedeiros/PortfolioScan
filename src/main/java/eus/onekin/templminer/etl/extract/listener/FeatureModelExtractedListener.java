package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.FeatureModelExtractedEvent;

public interface FeatureModelExtractedListener {

    void onFeatureModelExtracted(FeatureModelExtractedEvent event);
}
