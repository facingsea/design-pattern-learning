package com.facingsea.design_pattern_learning.t_state.a;

public class Context {
	
	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		if(state.getValue().equals("s1")){
			state.method1();
		}else if(state.getValue().equals("s2")){
			state.method2();
		}
	}

}
