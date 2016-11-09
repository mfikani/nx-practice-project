package com.nx.practice.learning.di.normal_ex.good_design.application_code.injector_classes.base_class;

import com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class.Consumer;

public interface MessageServiceInjector {
	public Consumer getConsumer();
}
