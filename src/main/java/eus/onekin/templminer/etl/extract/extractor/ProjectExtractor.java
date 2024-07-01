package eus.onekin.portfolioscan.etl.extract.extractor;

import eus.onekin.portfolioscan.etl.extract.listener.ProjectExtractedListener;

import java.util.List;

public interface ProjectExtractor {


    void setListeners(List<ProjectExtractedListener> listeners);

}
