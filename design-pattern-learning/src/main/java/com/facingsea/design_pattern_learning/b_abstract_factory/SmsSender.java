package com.facingsea.design_pattern_learning.b_abstract_factory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is sms sender.");
	}

}
