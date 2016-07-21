package com.facingsea.design_pattern_learning.d_builder.a;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * @author wangzhf
 *
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}