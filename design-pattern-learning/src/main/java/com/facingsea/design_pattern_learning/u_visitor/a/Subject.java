package com.facingsea.design_pattern_learning.u_visitor.a;

public interface Subject {
	
	public void accept(Visitor visitor);
	
	public String getSubject();

}
