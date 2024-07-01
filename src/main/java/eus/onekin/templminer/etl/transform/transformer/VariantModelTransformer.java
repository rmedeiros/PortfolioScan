package eus.onekin.portfolioscan.etl.transform.transformer;


import eus.onekin.portfolioscan.etl.extract.event.VariantModelExtractedEvent;
import eus.onekin.portfolioscan.etl.extract.listener.VariantModelExtractedListener;
import eus.onekin.portfolioscan.etl.load.model.VariantModelMeasurement;
import eus.onekin.portfolioscan.etl.transform.event.VariantModelTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.VariantModelTransformedListener;

import java.util.List;

public class VariantModelTransformer implements VariantModelExtractedListener {

    private final List<VariantModelTransformedListener> variantModelTransformedListeners;

    public VariantModelTransformer(List<VariantModelTransformedListener> variantModelTransformedListeners) {
        this.variantModelTransformedListeners = variantModelTransformedListeners;
    }

    @Override
    public void onVariantModelExtracted(VariantModelExtractedEvent event) {
        VariantModelMeasurement variantModelMeasurement = new VariantModelMeasurement();
        variantModelMeasurement.setConfigSpaceId(event.getConfigspaceId());
        variantModelMeasurement.setName(event.getName());
        variantModelMeasurement.setId(event.getId());
        variantModelMeasurement.setProjectName(event.getProject().getName());
        variantModelMeasurement.setProjectId(event.getProject().getId());
        variantModelMeasurement.setVersionName(event.getVersion().getName());
        variantModelMeasurement.setVersionTimeStamp(event.getVersion().getCreated());
        variantModelMeasurement.setSelectedElementsCount(event.getSelectedElementCount());
        variantModelMeasurement.setUnselectedElementsCount(event.getUnselectedElementsCount());
        variantModelMeasurement.setSelectedFeaturesIds(event.getSelectedFeaturesIds());
        for (VariantModelTransformedListener listener : variantModelTransformedListeners) {
            listener.onVariantModelTransformed(new VariantModelTransformedEvent(variantModelMeasurement));
        }
    }



    public List<VariantModelTransformedListener> getVariantModelTransformedListeners() {
        return variantModelTransformedListeners;
    }
}
