package com.nx.practice.learning.di.normal_ex.good_design.application_code.service_consumer.base_class;
//note: base class for Consumer Services is not required, but is preferable to have it

public interface Consumer {
	void processMessages(String msg, String rec);
}
