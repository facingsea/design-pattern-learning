package com.facingsea.design_pattern_learning.a_factory.a_common;

import static org.junit.Assert.assertNotNull;

import com.facingsea.design_pattern_learning.a_factory.MailSender;
import com.facingsea.design_pattern_learning.a_factory.Sender;
import com.facingsea.design_pattern_learning.a_factory.SmsSender;

public class SenderFactory {
	
	public Sender produce(String type){
		assertNotNull(type);
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}
		return null;
	}

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.send();
		Sender s2 = factory.produce("sms");
		s2.send();
	}
}
