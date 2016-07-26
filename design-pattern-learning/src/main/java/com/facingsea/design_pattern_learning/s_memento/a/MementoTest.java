package com.facingsea.design_pattern_learning.s_memento.a;

/**
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，
 * 通俗的讲下：假设有原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，
 * 类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。
 * 
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例，该模式很好理解。
 * 
 * 
 * @author wangzhf
 *
 */
public class MementoTest {
	
	public static void main(String[] args) {
		Original o = new Original("hello");
		
		Storage s = new Storage(o.createMemento());
		
		System.out.println("init: value: " + o.getValue());
		
		o.setValue("world");
		
		System.out.println("new value: " + o.getValue());
		
		o.restoreMemento(s.getMemento());
		
		System.out.println("after restore, the value is : " + o.getValue());
	}

}
