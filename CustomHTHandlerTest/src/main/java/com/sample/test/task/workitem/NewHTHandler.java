package com.sample.test.task.workitem;

import org.kie.api.runtime.process.*;

public class NewHTHandler implements WorkItemHandler {
    private WorkItem workItem;
    private boolean aborted = false; 
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
    	System.out.println(" ****** INSIDE 'NewHTHandler.executeWorkItem(WorkItem workItem, WorkItemManager manager)'  ****** ");
        this.workItem = workItem;
    }
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
    	System.out.println(" ****** INSIDE 'NewHTHandler.abortWorkItem(WorkItem workItem, WorkItemManager manager)'  ****** ");
        aborted = true;
    }
    public WorkItem getWorkItem() {
        return workItem;
    }
    public boolean isAborted() {
        return aborted;
    }
    public void reset() {
        workItem = null;
    }
}