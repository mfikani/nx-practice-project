package com.nx.practice.learning.di.normal_ex.bad_design.client_code;

import com.nx.practice.learning.di.normal_ex.bad_design.application_code.MyApplication;

public class MyLegacyTest {
	public static void main(String[] args){
		MyApplication app = new MyApplication();
		app.processMessages("Hi Miled", "miled@abc.com");
	}
}
