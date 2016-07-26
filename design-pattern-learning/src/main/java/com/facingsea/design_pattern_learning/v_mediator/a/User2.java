package com.facingsea.design_pattern_learning.v_mediator.a;

public class User2 extends User {
	
	public User2(Mediator mediator){
		super(mediator);
	}
	
	public void work() {
		System.out.println("user 2 work ...");
	};

}
