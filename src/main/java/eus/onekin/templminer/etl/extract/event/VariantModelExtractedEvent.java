package eus.onekin.portfolioscan.etl.extract.event;


import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;


import java.util.List;

public class VariantModelExtractedEvent extends FeatureModelExtractedEvent {

    private String configspaceId;
    private List<String> modelLabels;
    private int selectedElementCount;
    private String selectedFeaturesIds;
    private int unselectedElementsCount;


    public VariantModelExtractedEvent(Project project, Version version
    ) {
        super(project, version);
    }

    public String getConfigspaceId() {
        return configspaceId;
    }

    public void setConfigspaceId(String configspaceId) {
        this.configspaceId = configspaceId;
    }

    public void setModelLabels(List<String> modelLabels) {
        this.modelLabels = modelLabels;
    }

    public List<String> getModelLabels() {
        return modelLabels;
    }


    public int getSelectedElementCount() {
        return selectedElementCount;
    }

    public void setSelectedElementCount(int selectedElementCount) {
        this.selectedElementCount = selectedElementCount;
    }

    public void setSelectedFeaturesIds(String selectedFeaturesIds) {
        this.selectedFeaturesIds=selectedFeaturesIds;
    }

    public String getSelectedFeaturesIds() {
        return selectedFeaturesIds;
    }

    public void setUnselectedElementsCount(int unselectedElementsCount) {
        this.unselectedElementsCount=unselectedElementsCount;
    }

    public int getUnselectedElementsCount() {
        return unselectedElementsCount;
    }
}
