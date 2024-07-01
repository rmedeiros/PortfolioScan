package eus.onekin.portfolioscan.etl.transform.transformer;


import eus.onekin.portfolioscan.etl.extract.event.ConfigSpaceExtractedEvent;
import eus.onekin.portfolioscan.etl.extract.listener.ConfigSpaceExtractedListener;
import eus.onekin.portfolioscan.etl.load.model.ConfigSpaceMeasurement;
import eus.onekin.portfolioscan.etl.transform.event.ConfigSpaceTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.ConfigSpaceTransformedListener;

import java.util.List;

public class ConfigSpaceDataTransformer implements ConfigSpaceExtractedListener {

    private final List<ConfigSpaceTransformedListener> listeners;

    public ConfigSpaceDataTransformer(List<ConfigSpaceTransformedListener> listeners) {
        this.listeners = listeners;
    }


    @Override
    public void onConfigSpaceExtracted(ConfigSpaceExtractedEvent event) {
        ConfigSpaceMeasurement configSpaceMeasurement = new ConfigSpaceMeasurement();
        configSpaceMeasurement.setName(event.getConfigSpaceName());

        configSpaceMeasurement.setNumberOfVariants(event.getExtractedVariantModelEventList().size());
        configSpaceMeasurement.setId(event.getConfigSpaceId());
        configSpaceMeasurement.setVersionTimeStamp(event.getVersion().getCreated());
        configSpaceMeasurement.setProjectId(event.getProject().getId());
        configSpaceMeasurement.setProjectName(event.getProject().getName());
        for (ConfigSpaceTransformedListener listener : listeners) {
            listener.onConfigSpaceTransformed(new ConfigSpaceTransformedEvent(configSpaceMeasurement));
        }
    }
}
