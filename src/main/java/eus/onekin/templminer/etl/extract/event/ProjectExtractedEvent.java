package eus.onekin.portfolioscan.etl.extract.event;

import eus.onekin.portfolioscan.etl.model.*;


public class ProjectExtractedEvent extends GeneralExtractionEvent {


    private int familyModelsCount;
    private int variantModelsCount;
    private int featureModelsCount;



    public ProjectExtractedEvent(Project project, int featureModelsCount,
            int variantModelsCount, int familyModelsCount,
            Version version) {
        super(project, version);
        this.variantModelsCount = variantModelsCount;
        this.familyModelsCount = familyModelsCount;
        this.featureModelsCount = featureModelsCount;
    }


    public int getFamilyModelsCount() {
        return familyModelsCount;
    }

    public void setFamilyModelsCount(int familyModelsCount) {
        this.familyModelsCount = familyModelsCount;
    }

    public int getVariantModelsCount() {
        return variantModelsCount;
    }

    public void setVariantModelsCount(int variantModelsCount) {
        this.variantModelsCount = variantModelsCount;
    }

    public int getFeatureModelsCount() {
        return featureModelsCount;
    }

    public void setFeatureModelsCount(int featureModelsCount) {
        this.featureModelsCount = featureModelsCount;
    }
}
