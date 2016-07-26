package com.facingsea.design_pattern_learning.f_adapter.b.obj;

import com.facingsea.design_pattern_learning.f_adapter.b.cls.Source;

public class WrapperTest {
	
	public static void main(String[] args) {
		Source source = new Source();
		Wrapper w = new Wrapper(source);
		w.method1();
		w.method2();
	}

}
