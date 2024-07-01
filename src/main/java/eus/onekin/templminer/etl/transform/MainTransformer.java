package eus.onekin.portfolioscan.etl.transform;

import eus.onekin.portfolioscan.etl.extract.listener.AllConfigSpacesExtractedListener;
import eus.onekin.portfolioscan.etl.extract.listener.ProjectExtractedListener;
import eus.onekin.portfolioscan.etl.extract.listener.VariantModelExtractedListener;
import eus.onekin.portfolioscan.etl.load.config.LoaderSetup;
import eus.onekin.portfolioscan.etl.transform.config.TransformerSetup;
import eus.onekin.portfolioscan.etl.transform.transformer.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTransformer {

    public TransformerSetup setup(LoaderSetup loaderSetup) {
        //Load what transformers listeners should be created
        List<ProjectExtractedListener> projectExtractedListeners = new ArrayList<>();
        projectExtractedListeners.add(new ProjectDataTransformer(loaderSetup.getTransformedProjectListeners()));
        List<VariantModelExtractedListener> variantModelExtractedListeners = new ArrayList<>();
        variantModelExtractedListeners.add(
                new VariantModelTransformer(loaderSetup.getVariantModelTransformedListeners()));
        List<AllConfigSpacesExtractedListener> allConfigSpacesExtractedListeners = new ArrayList<>();
        TransformerSetup transformerSetup = new TransformerSetup();
        transformerSetup.getFeatureExtractedEventListeners().add(new FeatureTransformer(loaderSetup.getFeaturesTransformedListeners()));
        transformerSetup.getFeatureModelExtractedListeners()
                .add(new FeatureModelTransformer(loaderSetup.getFeatureModelTransformedListeners()));
        transformerSetup.setExtractedProjectListeners(projectExtractedListeners, allConfigSpacesExtractedListeners);
        transformerSetup.setVariantModelExtractedListeners(variantModelExtractedListeners);
        transformerSetup.getConfigSpaceExtractedListeners()
                .add(new ConfigSpaceDataTransformer(loaderSetup.getConfigSpaceTransformedListeners()));
        transformerSetup.setFeatureExtractedEventListeners(
                Collections.singletonList(new FeatureTransformer(loaderSetup.getFeaturesTransformedListeners())));
        return transformerSetup;
    }


}
