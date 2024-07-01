package eus.onekin.portfolioscan.etl.extract.event;



import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;

import java.util.List;

public class AllFeatureModelsExtractedEvent extends GeneralExtractionEvent {

    private List<FeatureModelExtractedEvent> featureModelExtractedEventList;


    public AllFeatureModelsExtractedEvent(Project project, Version version,
            List<FeatureModelExtractedEvent> featureModelExtractedEventList) {
        super(project, version);
        this.featureModelExtractedEventList = featureModelExtractedEventList;
    }


    public List<FeatureModelExtractedEvent> getFeatureModelExtractedEventList() {
        return featureModelExtractedEventList;
    }

    public void setFeatureModelExtractedEventList(
            List<FeatureModelExtractedEvent> featureModelExtractedEventList) {
        this.featureModelExtractedEventList = featureModelExtractedEventList;
    }

}
