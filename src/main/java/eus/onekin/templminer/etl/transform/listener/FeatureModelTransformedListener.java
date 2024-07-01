package eus.onekin.portfolioscan.etl.transform.listener;

import eus.onekin.portfolioscan.etl.transform.event.FeatureModelTransformedEvent;

public interface FeatureModelTransformedListener {

    void onFeatureModelTransformed(FeatureModelTransformedEvent event);
}
