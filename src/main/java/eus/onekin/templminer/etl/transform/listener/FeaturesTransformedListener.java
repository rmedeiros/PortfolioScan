package eus.onekin.portfolioscan.etl.transform.listener;

import eus.onekin.portfolioscan.etl.transform.event.FeatureTransformedEvent;

public interface FeaturesTransformedListener {

    void onfFeatureTransformed(FeatureTransformedEvent featureTransformedEvent);

}
