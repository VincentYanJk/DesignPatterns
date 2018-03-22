package com.pwc.desingerPattern.observePattern;

public interface Observable {

	
    public boolean states = false; 
	
	public void registerObserver(Observer o) ;
	public void removeObserver(Observer o) ;
	public void notificyObserver(Observer o);
	public void notificyAllObserver();
	
}
