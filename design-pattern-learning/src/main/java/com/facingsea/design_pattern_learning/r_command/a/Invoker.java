package com.facingsea.design_pattern_learning.r_command.a;

/**
 * 调用者（司令员）
 * @author wangzhf
 *
 */
public class Invoker {
	
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action(){
		command.exec();
	}

}
