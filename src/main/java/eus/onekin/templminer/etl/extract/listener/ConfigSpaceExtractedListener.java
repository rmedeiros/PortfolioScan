package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.ConfigSpaceExtractedEvent;

public interface ConfigSpaceExtractedListener {


    void onConfigSpaceExtracted(
            ConfigSpaceExtractedEvent configSpaceExtractedEvent);
}
