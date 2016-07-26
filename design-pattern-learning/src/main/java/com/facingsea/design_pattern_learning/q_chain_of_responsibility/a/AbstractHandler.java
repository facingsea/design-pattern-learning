package com.facingsea.design_pattern_learning.q_chain_of_responsibility.a;

public class AbstractHandler {

	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
