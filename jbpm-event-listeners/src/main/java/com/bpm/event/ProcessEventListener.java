package com.bpm.event;

import java.util.EventListener;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.event.process.SLAViolatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProcessEventListener implements EventListener {
	
	Logger logger=LoggerFactory.getLogger(CustomProcessEventListener.class);

	public void beforeProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub

	}

	public void afterProcessStarted1(ProcessStartedEvent event) {
		logger.info("Process started");
		logger.info("process id {} ",event.getProcessInstance().getProcessId());
		//event.getProcessInstance().getp

	}

    
    void beforeProcessStarted1(ProcessStartedEvent event) {
	}

   
    void afterProcessStarted(ProcessStartedEvent event) {
	}

   
    void beforeProcessCompleted(ProcessCompletedEvent event) {
	}

    
    void afterProcessCompleted(ProcessCompletedEvent event) {
	}

  
    void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
	}

   
    void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
	}

   
    void beforeNodeLeft(ProcessNodeLeftEvent event) {
	}

    
    void afterNodeLeft(ProcessNodeLeftEvent event) {
	}

    void beforeVariableChanged(ProcessVariableChangedEvent event) {
	}

   
    void afterVariableChanged(ProcessVariableChangedEvent event) {
	}
   
    void beforeSLAViolated(SLAViolatedEvent event){};

    
     void afterSLAViolated(SLAViolatedEvent event){};

}