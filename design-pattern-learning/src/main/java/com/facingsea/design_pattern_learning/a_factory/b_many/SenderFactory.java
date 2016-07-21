package com.facingsea.design_pattern_learning.a_factory.b_many;

import com.facingsea.design_pattern_learning.a_factory.MailSender;
import com.facingsea.design_pattern_learning.a_factory.Sender;
import com.facingsea.design_pattern_learning.a_factory.SmsSender;

public class SenderFactory {
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produceMail();
		sender.send();
	}
}
