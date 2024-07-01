package eus.onekin.portfolioscan.etl.transform.event;

import eus.onekin.portfolioscan.etl.load.model.ProjectMeasurement;

public class ProjectTransformedEvent {

    private ProjectMeasurement projectMeasurement;

    public ProjectTransformedEvent(ProjectMeasurement projectMeasurement) {
        this.projectMeasurement = projectMeasurement;
    }

    public ProjectTransformedEvent() {
    }


    public ProjectMeasurement getProjectMeasurement() {
        return projectMeasurement;
    }

    public void setProjectMeasurement(ProjectMeasurement projectMeasurement) {
        this.projectMeasurement = projectMeasurement;
    }
}
