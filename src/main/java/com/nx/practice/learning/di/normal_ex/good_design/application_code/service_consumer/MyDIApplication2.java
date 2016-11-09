package com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component.base_class.MessageService;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class.Consumer;

public class MyDIApplication2 implements Consumer{

	private MessageService service;
	
	public MyDIApplication2(){}
	
	// setter dependency injection
	public void setService(MessageService service){
		this.service = service;
	}
	
	@Override
	public void processMessages(String msg, String rec) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
		
	}
	

}
