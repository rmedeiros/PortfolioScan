package eus.onekin.portfolioscan.etl.extract.event;

import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;

import java.util.Objects;

public class FeatureExtractedEvent extends GeneralExtractionEvent {
    public FeatureExtractedEvent(Project project,
            Version version) {
        super(project, version);
    }

    private String name;

    private String id;

    private String featureModelId;

    private int productsUsingIt;

    private int productsSelectingIt;
    private int numberOfAttributes;

    public FeatureExtractedEvent(Project project,
            Version version,String id, String featureName, String featureModelId) {
        super(project,version);
        this.id=id;
        this.name=featureName;
        this.featureModelId=featureModelId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeatureModelId() {
        return featureModelId;
    }

    public void setFeatureModelId(String featureModelId) {
        this.featureModelId = featureModelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductsUsingIt() {
        return productsUsingIt;
    }

    public void setProductsUsingIt(int productsUsingIt) {
        this.productsUsingIt = productsUsingIt;
    }

    public int getProductsSelectingIt() {
        return productsSelectingIt;
    }

    public void setProductsSelectingIt(int productsSelectingIt) {
        this.productsSelectingIt = productsSelectingIt;
    }

    public int getNumberOfAttributes() {
        return numberOfAttributes;
    }

    public void setNumberOfAttributes(int numberOfAttributes) {
        this.numberOfAttributes = numberOfAttributes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeatureExtractedEvent that = (FeatureExtractedEvent) o;
        return id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void incrementNumOfProductsSelectingIt() {
        this.productsSelectingIt++;
    }

    @Override
    public String toString() {
        return "FeatureMeasurement{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", productsUsingIt=" + productsUsingIt +
                '}';
    }

}
