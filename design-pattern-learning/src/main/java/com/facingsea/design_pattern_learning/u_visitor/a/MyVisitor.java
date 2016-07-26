package com.facingsea.design_pattern_learning.u_visitor.a;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the sub: " + sub.getSubject());
	}

}
