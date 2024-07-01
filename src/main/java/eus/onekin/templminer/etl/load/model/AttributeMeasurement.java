package eus.onekin.portfolioscan.etl.load.model;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;

import java.util.Objects;

@Measurement(name = "attribute")
public class AttributeMeasurement extends  GeneralMeasurement{



    @Column(tag = true)
    private String id;
    @Column(tag = true)
    private String feature;

    @Column(tag = true)
    private String name;

    @Column
    private String strValue;

    @Column
    private int intValue;

    @Column(tag = true)
    private String variantId;

    @Column(tag = true)
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
        return id.equals(that.id) && strValue.equals(that.strValue) && variantId.equals(that.variantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, strValue, variantId);
    }
}
