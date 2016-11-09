package com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component.base_class.MessageService;

public class SMSServiceImpl implements MessageService{
	
	@Override
	public void sendMessage(String msg, String rec){
		// logic to send SMS
		System.out.println("SMS send to "+rec+" with Message="+msg);
	}
}
