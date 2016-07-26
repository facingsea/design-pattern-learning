package com.facingsea.design_pattern_learning.o_observer.a;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("the subject has changed .");
		notifyObservers(); // 通知观察者
	}

}
