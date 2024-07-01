package eus.onekin.portfolioscan.etl.model;

import java.util.List;

public class Project {

    private String id;
    private String name;

    //Referenced projects
    private List<String> references;
    private List<String> configSpaces;

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public void setConfigSpaces(List<String> configSpaces) {
        this.configSpaces = configSpaces;
    }

    public List<String> getReferences() {
        return references;
    }

    public List<String> getConfigSpaces() {
        return configSpaces;
    }


}
