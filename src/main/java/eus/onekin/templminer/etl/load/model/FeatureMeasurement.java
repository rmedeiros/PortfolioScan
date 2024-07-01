package eus.onekin.portfolioscan.etl.load.model;


import com.influxdb.annotations.Measurement;
import com.influxdb.annotations.Column;

import java.util.Objects;

@Measurement(name = "feature")
public class FeatureMeasurement extends GeneralMeasurement{

    @Column(tag = true)
    private String name;

    @Column(tag = true)
    private String id;

    @Column
    private String featureModelId;

    @Column
    private int productsUsingIt;

    @Column
    private int productsSelectingIt;

    @Column
    private int numberOfAttributes;


    public FeatureMeasurement(String id) {
        this.id = id;
    }

    public FeatureMeasurement(String id, String name, String featureModelId) {
        this.id = id;
        this.name = name;
        this.featureModelId = featureModelId;
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
        FeatureMeasurement that = (FeatureMeasurement) o;
        return id.equals(that.id);
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
