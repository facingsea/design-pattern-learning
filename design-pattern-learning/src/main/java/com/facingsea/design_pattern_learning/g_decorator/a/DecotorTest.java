package com.facingsea.design_pattern_learning.g_decorator.a;

public class DecotorTest {
	
	public static void main(String[] args) {
		Sourceable s1 = new Source();
		Sourceable s2 = new Decorator(s1);
		
		s2.method();
	}

}
