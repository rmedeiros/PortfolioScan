package eus.onekin.portfolioscan.etl.extract.event;


import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;

import java.util.ArrayList;
import java.util.List;

public class ConfigSpaceExtractedEvent extends GeneralExtractionEvent {

    private String configSpaceName;
    private String configSpaceId;

    private List<VariantModelExtractedEvent> extractedVariantModelEventList;
    private List<String> usedModelsIds;

    public ConfigSpaceExtractedEvent(Project project, Version version) {
        super(project, version);
        this.extractedVariantModelEventList = new ArrayList<>();
    }

    public List<VariantModelExtractedEvent> getExtractedVariantModelEventList() {
        return this.extractedVariantModelEventList;
    }

    public void setExtractedVariantModelEventList(
            List<VariantModelExtractedEvent> extractedVariantModelEventList) {
        this.extractedVariantModelEventList = extractedVariantModelEventList;
    }


    public String getConfigSpaceName() {
        return configSpaceName;
    }

    public void setConfigSpaceName(String configSpaceName) {
        this.configSpaceName = configSpaceName;
    }

    public String getConfigSpaceId() {
        return configSpaceId;
    }

    public void setConfigSpaceId(String configSpaceId) {
        this.configSpaceId = configSpaceId;
    }

    public List<String> getUsedModelsIds() {
        return usedModelsIds;
    }

    public void setUsedModelsIds(List<String> usedModelsIds) {
        this.usedModelsIds = usedModelsIds;
    }


}
