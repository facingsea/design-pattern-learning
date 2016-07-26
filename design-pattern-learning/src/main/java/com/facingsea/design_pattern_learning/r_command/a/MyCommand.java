package com.facingsea.design_pattern_learning.r_command.a;

/**
 * 命令，持有接收对象
 * @author wangzhf
 *
 */
public class MyCommand implements Command {

	Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exec() {
		receiver.action();
	}

}
