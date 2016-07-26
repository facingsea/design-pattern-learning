package com.facingsea.design_pattern_learning.q_chain_of_responsibility.a;

public class MyHandler extends AbstractHandler implements Handler {

	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println("hello, " + name);
		
		if(getHandler() != null ){
			getHandler().operator();
		}
	}

}
