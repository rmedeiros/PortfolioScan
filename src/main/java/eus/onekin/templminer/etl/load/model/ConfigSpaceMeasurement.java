package eus.onekin.portfolioscan.etl.load.model;


import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;


@Measurement(name = "configspace")
public class ConfigSpaceMeasurement extends GeneralMeasurement {



    @Column(tag = true)
    private String id;

    @Column(tag = true)
    private String name;


    //Number of variants created in this configspace
    @Column
    public int numberOfVariants;


    //Models selected to be part of the configspace
    @Column
    public String usedModels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVariants() {
        return numberOfVariants;
    }

    public void setNumberOfVariants(int numberOfVariants) {
        this.numberOfVariants = numberOfVariants;
    }

    public String getUsedModels() {
        return usedModels;
    }

    public void setUsedModels(String usedModels) {
        this.usedModels = usedModels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
