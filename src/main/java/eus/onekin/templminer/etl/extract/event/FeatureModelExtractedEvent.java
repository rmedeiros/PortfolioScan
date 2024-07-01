package eus.onekin.portfolioscan.etl.extract.event;

import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;

import java.util.List;


public class FeatureModelExtractedEvent extends GeneralExtractionEvent {

    private String name;
    private String id;
    private List<String> featureIds;

    private long elementCount;
    private long featureCount;
    private float flexibilityRatio;
    private long attributeCount;
    private long constraintCount;

    public FeatureModelExtractedEvent(Project project, Version version, String name, String id, List<String> featureIds,
            int elementCount, int featureCount, float flexibilityRatio, int attributeCount, int constraintCount) {
        super(project, version);
        this.name = name;
        this.id = id;
        this.featureIds = featureIds;
        this.elementCount = elementCount;
        this.featureCount = featureCount;
        this.flexibilityRatio = flexibilityRatio;
        this.attributeCount = attributeCount;
        this.constraintCount = constraintCount;
    }

    public FeatureModelExtractedEvent(Project project, Version version) {
        super(project,version);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getFeatureIds() {
        return featureIds;
    }

    public void setFeatureIds(List<String> featureIds) {
        this.featureIds = featureIds;
    }

    public long getElementCount() {
        return elementCount;
    }

    public void setElementCount(long elementCount) {
        this.elementCount = elementCount;
    }

    public long getFeatureCount() {
        return featureCount;
    }

    public void setFeatureCount(long featureCount) {
        this.featureCount = featureCount;
    }

    public float getFlexibilityRatio() {
        return flexibilityRatio;
    }

    public void setFlexibilityRatio(float flexibilityRatio) {
        this.flexibilityRatio = flexibilityRatio;
    }

    public long getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(long attributeCount) {
        this.attributeCount = attributeCount;
    }

    public long getConstraintCount() {
        return constraintCount;
    }

    public void setConstraintCount(long constraintCount) {
        this.constraintCount = constraintCount;
    }
}
