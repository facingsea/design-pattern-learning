package com.facingsea.design_pattern_learning.s_memento.a;

public class Original {
	
	private String value;

	public Original(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Memento createMemento(){
		return new Memento(value);
	}
	
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
}
