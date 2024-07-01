package eus.onekin.portfolioscan.etl.load.model;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;


@Measurement(name = "variantmodel")
public class VariantModelMeasurement extends  GeneralMeasurement{

    @Column(tag = true)
    private String id;

    @Column(tag = true)
    private String name;

    @Column
    private String[] featureSelections;

    @Column
    private int selectedElementsCount;


    @Column
    private int unselectedElementsCount;

    @Column(tag = true)
    private String configSpaceId;


    @Column
    private String selectedFeaturesIds;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFeatureSelections() {
        return featureSelections;
    }

    public void setFeatureSelections(String[] featureSelections) {
        this.featureSelections = featureSelections;
    }

    public int getSelectedElementsCount() {
        return selectedElementsCount;
    }

    public void setSelectedElementsCount(int selectedElementsCount) {
        this.selectedElementsCount = selectedElementsCount;
    }

    public int getUnselectedElementsCount() {
        return unselectedElementsCount;
    }

    public void setUnselectedElementsCount(int unselectedElementsCount) {
        this.unselectedElementsCount = unselectedElementsCount;
    }

    public String getConfigSpaceId() {
        return configSpaceId;
    }

    public void setConfigSpaceId(String configSpaceId) {
        this.configSpaceId = configSpaceId;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setSelectedFeaturesIds(String selectedFeaturesIds) {
        this.selectedFeaturesIds = selectedFeaturesIds;
    }

    public String getId() {
        return id;
    }

    public String getSelectedFeaturesIds() {
        return selectedFeaturesIds;
    }
}
