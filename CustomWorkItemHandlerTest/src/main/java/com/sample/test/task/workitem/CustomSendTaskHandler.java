package com.sample.test.task.workitem;

import org.jbpm.bpmn2.handler.SendTaskHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

public class CustomSendTaskHandler extends SendTaskHandler {
	
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
    	System.out.println(" ****** INSIDE 'CustomSendTaskHandler.executeWorkItem(WorkItem workItem, WorkItemManager manager)'  ****** ");
        super.executeWorkItem(workItem, manager);
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
    	System.out.println(" ****** INSIDE 'CustomSendTaskHandler.abortWorkItem(WorkItem workItem, WorkItemManager manager)'  ****** ");
        // Do nothing, cannot be aborted
    }

}
