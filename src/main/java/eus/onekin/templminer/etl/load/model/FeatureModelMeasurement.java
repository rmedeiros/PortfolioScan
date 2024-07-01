package eus.onekin.portfolioscan.etl.load.model;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;

import java.util.List;

@Measurement(name = "featuremodel")
public class FeatureModelMeasurement extends  GeneralMeasurement{


    @Column(tag = true)
    private String id;
    @Column(tag = true)
    private String name;



    @Column
    private List<String> features;

    @Column
    private int variationCount;

    @Column
    private long attributeCount;

    @Column
    private long featuresCount;

    @Column
    private long relationCount;

    @Column
    private int variationTypesCount;

    @Column
    private long elementCount;

    @Column
    private long restrictionCount;

    @Column
    private long constraintCount;

    @Column
    private float flexibilityRatio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public int getVariationCount() {
        return variationCount;
    }

    public void setVariationCount(int variationCount) {
        this.variationCount = variationCount;
    }

    public long getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(long attributeCount) {
        this.attributeCount = attributeCount;
    }


    public long getFeaturesCount() {
        return featuresCount;
    }

    public void setFeaturesCount(long featuresCount) {
        this.featuresCount = featuresCount;
    }

    public long getRelationCount() {
        return relationCount;
    }

    public void setRelationCount(long relationCount) {
        this.relationCount = relationCount;
    }

    public int getVariationTypesCount() {
        return variationTypesCount;
    }

    public void setVariationTypesCount(int variationTypesCount) {
        this.variationTypesCount = variationTypesCount;
    }

    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }

    public void setElementCount(long elementCount) {
        this.elementCount = elementCount;
    }

    public long getElementCount() {
        return elementCount;
    }

    public long getRestrictionCount() {
        return restrictionCount;
    }

    public void setRestrictionCount(long restrictionCount) {
        this.restrictionCount = restrictionCount;
    }

    public long getConstraintCount() {
        return constraintCount;
    }

    public void setConstraintCount(long constraintCount) {
        this.constraintCount = constraintCount;
    }

    public void setFlexibilityRatio(float flexibilityRatio) {
        this.flexibilityRatio = flexibilityRatio;
    }

    public float getFlexibilityRatio() {
        return flexibilityRatio;
    }
}
