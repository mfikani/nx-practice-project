package com.nx.practice.learning.di.normal_ex.bad_design.application_code;

import com.nx.practice.learning.di.normal_ex.bad_design.application_code.service.EmailService;

public class MyApplication {
	EmailService email = new EmailService();
		
	public void processMessages(String msg, String rec){
		// do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}
