package com.pwc.desingerPattern.observePattern;

import java.util.ArrayList;
import java.util.List;


public class MeetingMemo implements Observable {
	
	private List<Observer> observers = null;
    private volatile boolean states = false;
	public MeetingMemo() {
		observers = new ArrayList<Observer>();
		

	}

	@Override
	public void registerObserver(Observer newObserver) {
		if (!observers.contains(newObserver)) {
			observers.add(newObserver);
		} else {
			return;
		}

	}

	@Override
	public void removeObserver(Observer removeObserver) {
		if (observers.indexOf(removeObserver) >= 0) {

			observers.remove(observers.indexOf(removeObserver));

		} else {
			return;

		}

	}



	public void meetingmMemoChanged(String latestContent) {
    
		this.setChanged();
		
		if(states) {
	    this.notificyAllObserver();
			
		}
		
		
	}
	
	public void setChanged() {
		
		states = true;

	}

	@Override
	public void notificyObserver(Observer o) {
	
		
	}

	@Override
	public void notificyAllObserver() {
		if(!observers.isEmpty()) {
			observers.stream().forEach(elt -> elt.update(elt, "testingiasda"));
		}else {
			
			return;
		}
		
	}

}
