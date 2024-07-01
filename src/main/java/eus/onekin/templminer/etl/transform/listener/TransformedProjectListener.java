package eus.onekin.portfolioscan.etl.transform.listener;

import eus.onekin.portfolioscan.etl.transform.event.ProjectTransformedEvent;

public interface TransformedProjectListener {

    void onProjectTransformed(ProjectTransformedEvent projectTransformedEvent);

}
