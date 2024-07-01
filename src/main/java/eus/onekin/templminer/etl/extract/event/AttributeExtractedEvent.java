package eus.onekin.portfolioscan.etl.extract.event;

import eus.onekin.portfolioscan.etl.load.model.AttributeMeasurement;

import java.util.Objects;

public class AttributeExtractedEvent {

    private String versionName;

    private String projectName;

    private String projectId;

    private String id;
    private String feature;

    private String name;

    private String strValue;

    private int intValue;

    private String variantId;

    private String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }


    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeMeasurement that = (AttributeMeasurement) o;
        return id.equals(that.getId()) && strValue.equals(that.getStrValue()) && variantId.equals(that.getVariantId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, strValue, variantId);
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
