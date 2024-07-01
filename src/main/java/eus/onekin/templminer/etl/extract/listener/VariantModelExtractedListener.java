package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.VariantModelExtractedEvent;

public interface VariantModelExtractedListener {

    void onVariantModelExtracted(VariantModelExtractedEvent event);

}
