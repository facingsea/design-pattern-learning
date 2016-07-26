package com.facingsea.design_pattern_learning.t_state.a;

public class State {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1(){
		System.out.println("method 1");
	}
	
	public void method2(){
		System.out.println("method 2");
	}
}
