package com.facingsea.design_pattern_learning.f_adapter.b.cls;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("This is the origin method 2 ...");
	}
	

}
