package com.facingsea.design_pattern_learning.b_abstract_factory;

/**
 * 其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
 * 同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 * @author wangzhf
 *
 */
public class MailSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

	public static void main(String[] args) {
		MailSenderFactory f = new MailSenderFactory();
		Sender s = f.produce();
		s.send();
	}
	
}
