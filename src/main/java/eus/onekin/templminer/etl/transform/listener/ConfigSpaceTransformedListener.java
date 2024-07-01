package eus.onekin.portfolioscan.etl.transform.listener;

import eus.onekin.portfolioscan.etl.transform.event.ConfigSpaceTransformedEvent;

public interface ConfigSpaceTransformedListener {

    void onConfigSpaceTransformed(ConfigSpaceTransformedEvent event);
}
