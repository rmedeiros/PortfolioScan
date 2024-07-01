package eus.onekin.portfolioscan.etl.transform.transformer;

import eus.onekin.portfolioscan.etl.extract.event.ProjectExtractedEvent;
import eus.onekin.portfolioscan.etl.extract.listener.ProjectExtractedListener;
import eus.onekin.portfolioscan.etl.load.model.ProjectMeasurement;
import eus.onekin.portfolioscan.etl.transform.event.ProjectTransformedEvent;
import eus.onekin.portfolioscan.etl.transform.listener.TransformedProjectListener;

import java.time.Instant;
import java.util.List;

public class ProjectDataTransformer implements ProjectExtractedListener {

    private List<TransformedProjectListener> listeners;

    public ProjectDataTransformer(List<TransformedProjectListener> transformedProjectListeners) {
        this.listeners = transformedProjectListeners;
    }

    public List<TransformedProjectListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<TransformedProjectListener> listeners) {
        this.listeners = listeners;
    }

    public void registerListener(TransformedProjectListener listener) {
        listeners.add(listener);
    }

    @Override
    public void onProjectsExtracted(ProjectExtractedEvent event) {
        ProjectMeasurement projectMeasurement;
        projectMeasurement = new ProjectMeasurement();
        projectMeasurement.setProjectId(event.getProject().getId());
        projectMeasurement.setProjectName(event.getProject().getName());

        projectMeasurement.setNumberOfConfigSpaces(2);
        projectMeasurement.setNumberOfVariantModels(event.getVariantModelsCount());
        projectMeasurement.setNumberOfFeatureModels(event.getFeatureModelsCount());
        projectMeasurement.setNumberOfFamilyModels(event.getFamilyModelsCount());
        projectMeasurement.setReferencedProjects(event.getProject().getReferences());
        if (event.getProject().getReferences() != null) {
            projectMeasurement.setNumOfReferencedProjects(event.getProject().getReferences().size());
        }
        projectMeasurement.setNumberOfConfigSpaces(event.getProject().getConfigSpaces().size());
        projectMeasurement.setVersionName(event.getVersion().getName());
        if (event.getVersion().getName().equals("HEAD")) {
            projectMeasurement.setVersionTimeStamp(Instant.now());
        } else {
            projectMeasurement.setVersionTimeStamp(event.getVersion().getCreated());
        }

        for (TransformedProjectListener listener : listeners) {
            listener.onProjectTransformed(new ProjectTransformedEvent(projectMeasurement));
        }
    }


}

