package com.facingsea.design_pattern_learning.a_factory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is mail sender ..");
	}

}
