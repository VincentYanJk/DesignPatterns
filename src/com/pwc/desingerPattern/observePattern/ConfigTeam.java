package com.pwc.desingerPattern.observePattern;

public class ConfigTeam implements Observer, IDisplay {



	@Override
	public void Display(Observer arg0, Object arg1) {
		System.out.println(arg0.getClass().getName()+"--"+arg1);
		
	}

	@Override
	public void update(Observer arg0, Object arg1) {
		Display( arg0,  arg1);
		
	}

}
