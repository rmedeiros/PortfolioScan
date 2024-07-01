package eus.onekin.portfolioscan.etl.transform.config;

import eus.onekin.portfolioscan.etl.extract.listener.*;

import java.util.ArrayList;
import java.util.List;

public class TransformerSetup {
    private List<ProjectExtractedListener> extractedProjectListeners = new ArrayList<>();
    private List<AllConfigSpacesExtractedListener> allConfigSpacesExtractedListeners = new ArrayList<>();
    private List<VariantModelExtractedListener> variantModelExtractedListeners = new ArrayList<>();
    private List<FeatureModelExtractedListener> featureModelExtractedListeners = new ArrayList<>();
    private List<ConfigSpaceExtractedListener> configSpaceExtractedListeners = new ArrayList<>();

    private List<FeatureExtractedEventListener> featureExtractedEventListeners = new ArrayList<>();


    public void setExtractedProjectListeners(List<ProjectExtractedListener> extractedProjectListeners,
            List<AllConfigSpacesExtractedListener> allConfigSpacesExtractedListeners) {
        this.extractedProjectListeners = extractedProjectListeners;
        this.allConfigSpacesExtractedListeners = allConfigSpacesExtractedListeners;
    }

    public List<ProjectExtractedListener> getExtractedProjectListeners() {
        return extractedProjectListeners;
    }


    public List<AllConfigSpacesExtractedListener> getAllConfigSpaceExtractedListeners() {
        return allConfigSpacesExtractedListeners;
    }

    public void setVariantModelExtractedListeners(List<VariantModelExtractedListener> variantModelExtractedListeners) {
        this.variantModelExtractedListeners = variantModelExtractedListeners;
    }

    public void setExtractedProjectListeners(
            List<ProjectExtractedListener> extractedProjectListeners) {
        this.extractedProjectListeners = extractedProjectListeners;
    }

    public void setAllConfigSpacesExtractedListeners(
            List<AllConfigSpacesExtractedListener> allConfigSpacesExtractedListeners) {
        this.allConfigSpacesExtractedListeners = allConfigSpacesExtractedListeners;
    }

    public List<VariantModelExtractedListener> getVariantModelExtractedListeners() {
        return variantModelExtractedListeners;
    }

    public List<FeatureModelExtractedListener> getFeatureModelExtractedListeners() {
        return featureModelExtractedListeners;
    }

    public void setFeatureModelExtractedListeners(
            List<FeatureModelExtractedListener> featureModelExtractedListeners) {
        this.featureModelExtractedListeners = featureModelExtractedListeners;
    }

    public List<ConfigSpaceExtractedListener> getConfigSpaceExtractedListeners() {
        return configSpaceExtractedListeners;
    }

    public void setConfigSpaceExtractedListeners(
            List<ConfigSpaceExtractedListener> configSpaceExtractedListeners) {
        this.configSpaceExtractedListeners = configSpaceExtractedListeners;
    }


    public List<FeatureExtractedEventListener> getFeatureExtractedEventListeners() {
        return featureExtractedEventListeners;
    }

    public void setFeatureExtractedEventListeners(
            List<FeatureExtractedEventListener> featureExtractedEventListeners) {
        this.featureExtractedEventListeners = featureExtractedEventListeners;
    }
}
