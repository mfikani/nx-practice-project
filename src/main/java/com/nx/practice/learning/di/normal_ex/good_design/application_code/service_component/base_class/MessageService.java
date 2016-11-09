package com.nx.practice.learning.di.normal_ex.good_design.application_code.service_component.base_class;
/*
 * note: Service components should be designed with base class or interface. It’s better to prefer interfaces or abstract classes that would define contract for the services.
 * */

/**
 * 
 * @author mfi
 *
 */
public interface MessageService {
	void sendMessage(String msg, String rec);
}
