package com.facingsea.design_pattern_learning.o_observer.a;

public interface Subject {
	
	// add a observer
	public void add(Observer observer);
	
	// delete a observer
	public void delete(Observer observer);
	
	// notify all the observers.
	public void notifyObservers();
	
	// other opt
	public void operation();

}
