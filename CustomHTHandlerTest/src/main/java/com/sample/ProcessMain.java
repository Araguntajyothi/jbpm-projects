package com.sample;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jbpm.test.JBPMHelper;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.task.TaskService;
import com.sample.test.task.workitem.NewHTHandler;

public class ProcessMain {

	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieBase kbase = kContainer.getKieBase("kbase");

		RuntimeManager manager = createRuntimeManager(kbase);
		RuntimeEngine engine = manager.getRuntimeEngine(null);
		
		KieSession ksession = engine.getKieSession();
		
		NewHTHandler custWIH = new NewHTHandler();
		ksession.getWorkItemManager().registerWorkItemHandler("Human Task", custWIH);		
		
		try {		
	
				ksession.startProcess("com.sample.bpmn.hello");
						
		        WorkItem workItem = custWIH.getWorkItem();
		        System.out.println("The current WorkItem details::: workitemId- '" + workItem.getId() + "' , workitemname- '" + workItem.getName() + "'");
		        ksession.getWorkItemManager().completeWorkItem(workItem.getId(), null);
		        
		        workItem = custWIH.getWorkItem();
		        System.out.println("The current WorkItem details::: workitemId- '" + workItem.getId() + "' , workitemname- '" + workItem.getName() + "'");
		        ksession.getWorkItemManager().completeWorkItem(workItem.getId(), null);
		        
	        
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