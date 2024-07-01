package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.FeatureExtractedEvent;

public interface FeatureExtractedEventListener {


    void onFeatureExtractedEvent(
            FeatureExtractedEvent featureExtractedEvent);
}
