package com.nx.practice.learning.di.normal_ex.bad_design.application_code.service;

public class EmailService {
	public void sendEmail(String message, String receiver){
		// logic to send email
		System.out.println("Email sent to "+receiver+" with Message="+message);
	}
}
