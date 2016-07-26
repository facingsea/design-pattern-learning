package com.facingsea.design_pattern_learning.o_observer.a;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> os = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		os.add(observer);
	}
	
	@Override
	public void delete(Observer observer) {
		os.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		Enumeration<Observer> obs = os.elements();
		while(obs.hasMoreElements()){
			Observer o = obs.nextElement();
			o.update();
		}
	}
}
