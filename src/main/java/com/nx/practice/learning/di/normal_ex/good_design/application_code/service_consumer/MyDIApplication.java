package com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component.base_class.MessageService;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class.Consumer;

// note: Notice that our application class is just using the service. It does not initialize the service that leads 
//		 to "separation of concerns". Also use of service interface allows us to easily test the application by mocking
//		 the MessageService and bind the services at runtime rather than compile time.

public class MyDIApplication implements Consumer{
	private MessageService service;
	
	public MyDIApplication(MessageService svc){
		this.service = svc;
	}
	
	@Override
	public void processMessages(String msg, String rec){
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}
