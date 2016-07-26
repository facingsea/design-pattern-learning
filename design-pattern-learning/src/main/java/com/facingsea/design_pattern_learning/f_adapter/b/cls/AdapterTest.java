package com.facingsea.design_pattern_learning.f_adapter.b.cls;

public class AdapterTest {
	
	public static void main(String[] args) {
		Targetable tar = new Adapter();
		tar.method1();
		tar.method2();
	}

}
