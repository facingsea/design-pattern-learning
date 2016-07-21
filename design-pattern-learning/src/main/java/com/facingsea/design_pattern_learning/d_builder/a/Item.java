package com.facingsea.design_pattern_learning.d_builder.a;

/**
 * 表示食物条目
 * @author wangzhf
 *
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}