package com.facingsea.design_pattern_learning.v_mediator.a;

public abstract class User {
	
	private Mediator mediator;

	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void work();

}
