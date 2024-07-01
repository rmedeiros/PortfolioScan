package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.AllConfigSpacesExtractedEvent;

public interface AllConfigSpacesExtractedListener {

    void onAllConfigSpacesExtracted(
            AllConfigSpacesExtractedEvent allConfigSpacesExtractedEvent);
}
