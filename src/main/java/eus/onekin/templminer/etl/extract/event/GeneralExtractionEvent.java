package eus.onekin.portfolioscan.etl.extract.event;


import eus.onekin.portfolioscan.etl.model.Project;
import eus.onekin.portfolioscan.etl.model.Version;

public abstract class GeneralExtractionEvent {

    private Project project;

    private Version version;

    protected GeneralExtractionEvent(Project project, Version version) {
        this.project = project;
        this.version = version;
    }


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }



    public void setVersion(Version revision) {
        this.version = revision;
    }

    public Version getVersion() {

        return version;
    }
}
