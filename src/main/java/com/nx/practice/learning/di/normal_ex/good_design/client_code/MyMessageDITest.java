package com.nx.practice.learning.di.normal_ex.good_design.client_code;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.base_class.MessageServiceInjector;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.injectors.EmailServiceInjector;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.injectors.SMSServiceInjector;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class.Consumer;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Miled";
		String email = "miled@abc.com";
		String phone = "000000";
		
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
		
		
		
	}

}
