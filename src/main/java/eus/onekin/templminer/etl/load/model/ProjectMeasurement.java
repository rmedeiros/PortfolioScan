package eus.onekin.portfolioscan.etl.load.model;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;

import java.util.List;

@Measurement(name = "project")
public class ProjectMeasurement  extends GeneralMeasurement{



    @Column
    private int numberOfConfigSpaces;

    @Column
    private int numberOfVariantModels;

    @Column
    private int numOfReferencedProjects;
    

    @Column
    private List<String> referencedProjects;

    @Column
    private int numberOfFeatureModels;
    @Column
    private int numberOfFamilyModels;


    public void setNumberOfFeatureModels(int numberOfFeatureModels) {
        this.numberOfFeatureModels = numberOfFeatureModels;
    }



    public int getNumberOfConfigSpaces() {
        return numberOfConfigSpaces;
    }

    public void setNumberOfConfigSpaces(int numberOfConfigSpaces) {
        this.numberOfConfigSpaces = numberOfConfigSpaces;
    }

    public int getNumberOfVariantModels() {
        return numberOfVariantModels;
    }

    public void setNumberOfVariantModels(int numberOfVariantModels) {
        this.numberOfVariantModels = numberOfVariantModels;
    }

    public int getNumOfReferencedProjects() {
        return numOfReferencedProjects;
    }

    public void setNumOfReferencedProjects(int numOfReferencedProjects) {
        this.numOfReferencedProjects = numOfReferencedProjects;
    }

    public List<String> getReferencedProjects() {
        return referencedProjects;
    }

    public void setReferencedProjects(List<String> referencedProjects) {
        this.referencedProjects = referencedProjects;
    }


    public void setNumberOfFamilyModels(int numberOFamilyModels) {
        this.numberOfFamilyModels = numberOFamilyModels;
    }

    public int getNumberOfFeatureModels() {
        return numberOfFeatureModels;
    }

    public int getNumberOfFamilyModels() {
        return numberOfFamilyModels;
    }
}
