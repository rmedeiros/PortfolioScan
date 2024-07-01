package eus.onekin.portfolioscan.etl.transform.listener;

import eus.onekin.portfolioscan.etl.transform.event.AttributesTransformedEvent;

public interface AttributesTransformedListener {

    void onAttributesTransformed(AttributesTransformedEvent event);
}
