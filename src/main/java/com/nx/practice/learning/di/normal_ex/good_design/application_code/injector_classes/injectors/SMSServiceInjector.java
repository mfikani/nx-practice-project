package com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.injectors;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.base_class.MessageServiceInjector;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component.SMSServiceImpl;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.MyDIApplication;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class.Consumer;

public class SMSServiceInjector implements MessageServiceInjector{

	public Consumer getConsumer(){
		return new MyDIApplication(new SMSServiceImpl());
	}
}
