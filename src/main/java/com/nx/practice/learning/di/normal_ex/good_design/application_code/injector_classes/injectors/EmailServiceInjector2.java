package com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.injectors;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.base_class.MessageServiceInjector;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component.EmailServiceImpl;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.MyDIApplication2;
import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class.Consumer;

public class EmailServiceInjector2 implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {
		MyDIApplication2 app = new MyDIApplication2();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
