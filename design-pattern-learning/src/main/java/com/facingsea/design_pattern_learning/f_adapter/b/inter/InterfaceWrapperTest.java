package com.facingsea.design_pattern_learning.f_adapter.b.inter;

public class InterfaceWrapperTest {
	
	public static void main(String[] args) {
		Sourceable s1 = new SourceSub1();
		Sourceable s2 = new SourceSub2();
		
		s1.method1();
		s2.method2();
	}

}
