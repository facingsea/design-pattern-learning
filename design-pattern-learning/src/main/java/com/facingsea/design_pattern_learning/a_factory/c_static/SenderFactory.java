package com.facingsea.design_pattern_learning.a_factory.c_static;

import com.facingsea.design_pattern_learning.a_factory.MailSender;
import com.facingsea.design_pattern_learning.a_factory.Sender;
import com.facingsea.design_pattern_learning.a_factory.SmsSender;

public class SenderFactory {
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		Sender sender = SenderFactory.produceMail();
		sender.send();
	}
}
