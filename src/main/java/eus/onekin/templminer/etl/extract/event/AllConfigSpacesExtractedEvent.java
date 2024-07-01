package eus.onekin.portfolioscan.etl.extract.event;


import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;

import java.util.ArrayList;
import java.util.List;

public class AllConfigSpacesExtractedEvent extends AllFeatureModelsExtractedEvent {
    private List<ConfigSpaceExtractedEvent> configSpaceExtractedEventList = new ArrayList<>();



    public AllConfigSpacesExtractedEvent(Project project, Version version,
            AllFeatureModelsExtractedEvent allFeatureModelsExtractedEvent) {
        super(project, version, allFeatureModelsExtractedEvent.getFeatureModelExtractedEventList());
    }
    public List<ConfigSpaceExtractedEvent> getConfigSpaceExtractedEventList() {
        return configSpaceExtractedEventList;
    }

    public void setConfigSpaceExtractedEventList(
            List<ConfigSpaceExtractedEvent> configSpaceExtractedEventList) {
        this.configSpaceExtractedEventList = configSpaceExtractedEventList;
    }
}
