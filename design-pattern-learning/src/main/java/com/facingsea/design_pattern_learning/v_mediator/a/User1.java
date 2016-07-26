package com.facingsea.design_pattern_learning.v_mediator.a;

public class User1 extends User {
	
	public User1(Mediator mediator){
		super(mediator);
	}
	
	public void work() {
		System.out.println("user 1 work ...");
	};

}
