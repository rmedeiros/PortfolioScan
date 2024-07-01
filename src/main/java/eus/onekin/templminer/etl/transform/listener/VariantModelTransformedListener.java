package eus.onekin.portfolioscan.etl.transform.listener;

import eus.onekin.portfolioscan.etl.transform.event.VariantModelTransformedEvent;

public interface VariantModelTransformedListener {

    void onVariantModelTransformed(VariantModelTransformedEvent variantModelTransformedEvent);
}
