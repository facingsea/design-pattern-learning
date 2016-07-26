package com.facingsea.design_pattern_learning.f_adapter.b.inter;

/**
 * 只用到Sourceable中的 method1方法
 * @author wangzhf
 *
 */
public class SourceSub1 extends Wrapper2 {

	@Override
	public void method1() {
		System.out.println("The method 1 implate");
	}
}
