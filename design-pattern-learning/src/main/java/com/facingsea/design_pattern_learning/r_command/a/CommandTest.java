package com.facingsea.design_pattern_learning.r_command.a;

public class CommandTest {
	
	public static void main(String[] args) {
		Receiver r = new Receiver();
		MyCommand c = new MyCommand(r);
		Invoker i = new Invoker(c);
		i.action();
	}

}
