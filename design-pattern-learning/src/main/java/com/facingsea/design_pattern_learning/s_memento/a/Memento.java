package com.facingsea.design_pattern_learning.s_memento.a;

public class Memento {
	
	private String value;

	public Memento(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
