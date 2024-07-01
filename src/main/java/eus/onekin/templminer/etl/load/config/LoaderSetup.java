package eus.onekin.portfolioscan.etl.load.config;

import eus.onekin.portfolioscan.etl.transform.listener.*;

import java.util.ArrayList;
import java.util.List;

public class LoaderSetup {
    private List<TransformedProjectListener> transformedProjectListeners = new ArrayList<>();
    private List<FeaturesTransformedListener> featuresTransformedListeners = new ArrayList<>();
    private List<VariantModelTransformedListener> variantModelTransformedListeners = new ArrayList<>();
    private List<FeatureModelTransformedListener> featureModelTransformedListeners = new ArrayList<>();
    private List<AttributesTransformedListener> attributesTransformedListeners = new ArrayList<>();
    private List<ConfigSpaceTransformedListener> configSpaceTransformedListeners = new ArrayList<>();


    public List<TransformedProjectListener> getTransformedProjectListeners() {
        return transformedProjectListeners;
    }

    public void setTransformedProjectListeners(
            List<TransformedProjectListener> transformedProjectListeners) {
        this.transformedProjectListeners = transformedProjectListeners;
    }

    public List<FeaturesTransformedListener> getFeaturesTransformedListeners() {
        return featuresTransformedListeners;
    }

    public void setFeaturesTransformedListeners(
            List<FeaturesTransformedListener> featuresTransformedListeners) {
        this.featuresTransformedListeners = featuresTransformedListeners;
    }

    public List<VariantModelTransformedListener> getVariantModelTransformedListeners() {
        return variantModelTransformedListeners;
    }

    public void setVariantModelTransformedListeners(
            List<VariantModelTransformedListener> variantModelTransformedListeners) {
        this.variantModelTransformedListeners = variantModelTransformedListeners;
    }

    public List<FeatureModelTransformedListener> getFeatureModelTransformedListeners() {
        return featureModelTransformedListeners;
    }

    public void setFeatureModelTransformedListeners(
            List<FeatureModelTransformedListener> featureModelTransformedListeners) {
        this.featureModelTransformedListeners = featureModelTransformedListeners;
    }

    public List<AttributesTransformedListener> getAttributesTransformedListeners() {
        return attributesTransformedListeners;
    }

    public void setAttributesTransformedListeners(List<AttributesTransformedListener> attributesTransformedListeners) {
        this.attributesTransformedListeners = attributesTransformedListeners;
    }

    public List<ConfigSpaceTransformedListener> getConfigSpaceTransformedListeners() {
        return configSpaceTransformedListeners;
    }
}
