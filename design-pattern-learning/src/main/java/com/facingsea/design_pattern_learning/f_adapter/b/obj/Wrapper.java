package com.facingsea.design_pattern_learning.f_adapter.b.obj;

import com.facingsea.design_pattern_learning.f_adapter.b.cls.Source;
import com.facingsea.design_pattern_learning.f_adapter.b.cls.Targetable;

/**
 * 对象的适配模式，持有Source类的实例，以达到解决兼容性的问题
 * @author wangzhf
 *
 */
public class Wrapper implements Targetable {

	Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the origin method 2");
	}

}
