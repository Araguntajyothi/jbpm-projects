package com.sample;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jbpm.test.JBPMHelper;
import org.junit.Test;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.api.runtime.process.WorkItem;

import com.sample.test.task.workitem.NewHTHandler;

public class ProcessTestJunit {

	@Test
	public void test() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieBase kbase = kContainer.getKieBase("kbase");

		RuntimeManager manager = createRuntimeManager(kbase);
		RuntimeEngine engine = manager.getRuntimeEngine(null);
		
		KieSession ksession = engine.getKieSession();
		
		NewHTHandler custWIH = new NewHTHandler();
		ksession.getWorkItemManager().registerWorkItemHandler("Human Task", custWIH);		
		
		try {		
	
				ProcessInstance pInstance = ksession.startProcess("com.sample.bpmn.hello");
				assertEquals(ProcessInstance.STATE_ACTIVE, pInstance.getState());
				
		        WorkItem workItem = custWIH.getWorkItem();
		        assertEquals("john", workItem.getParameter("ActorId"));
		        System.out.println("The current WorkItem details::: workitemId- '" + workItem.getId() + "' , workitemname- '" + workItem.getName() + "' , ActorId: '" + workItem.getParameter("ActorId") + "'");
		        ksession.getWorkItemManager().completeWorkItem(workItem.getId(), null);
		        
		        WorkItem workItem1 = custWIH.getWorkItem();
		        assertEquals("mary", workItem1.getParameter("ActorId"));
		        System.out.println("The current WorkItem details::: workitemId- '" + workItem1.getId() + "' , workitemname- '" + workItem1.getName() + "' , ActorId: '" + workItem1.getParameter("ActorId") + "'");
		        ksession.getWorkItemManager().completeWorkItem(workItem1.getId(), null);
		        System.out.println("Process state: " + pInstance.getState());      
	        
			assertEquals(ProcessInstance.STATE_COMPLETED, pInstance.getState());
	        
			} catch (Exception e) {
				
				System.out.println("Exception caught :( ");
				e.printStackTrace();
			} finally {				
				
			ksession.dispose();
			manager.disposeRuntimeEngine(engine);
			System.exit(0);
			}
		

	}

	private static RuntimeManager createRuntimeManager(KieBase kbase) {
		JBPMHelper.startH2Server();
		JBPMHelper.setupDataSource();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.jbpm.persistence.jpa");
		RuntimeEnvironmentBuilder builder = RuntimeEnvironmentBuilder.Factory.get()
			.newDefaultBuilder().entityManagerFactory(emf)
			.knowledgeBase(kbase);
		return RuntimeManagerFactory.Factory.get()
			.newSingletonRuntimeManager(builder.get(), "com.sample:example:1.0");
	}

}