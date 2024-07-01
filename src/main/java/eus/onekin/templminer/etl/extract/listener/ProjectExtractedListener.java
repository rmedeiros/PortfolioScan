package eus.onekin.portfolioscan.etl.extract.listener;

import eus.onekin.portfolioscan.etl.extract.event.ProjectExtractedEvent;

public interface ProjectExtractedListener {

    void onProjectsExtracted(ProjectExtractedEvent event);
}
