package com.pwc.desingerPattern.observePattern;

public class FormTeam implements Observer, IDisplay {



	@Override
	public void update(Observer arg0, Object arg1) {
		Display( arg0,  arg1);
	}

	@Override
	public void Display(Observer arg0, Object arg1) {
		System.out.println(arg0.getClass().getName()+"--"+arg1);
		
	}

}
