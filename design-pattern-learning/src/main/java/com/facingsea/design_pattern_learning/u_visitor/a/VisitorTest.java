package com.facingsea.design_pattern_learning.u_visitor.a;

/**
 * 访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，
 * 可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 * @author wangzhf
 *
 */
public class VisitorTest {
	
	public static void main(String[] args) {
		Visitor v = new MyVisitor();
		Subject s = new MySubject();
		
		s.accept(v);
	}

}
