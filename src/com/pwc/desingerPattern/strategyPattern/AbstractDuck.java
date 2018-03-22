package com.pwc.desingerPattern.strategyPattern;

public abstract class AbstractDuck {
	
	public IFlyFunction flyFuncStion;
	
	public void setFlyFuncStion(IFlyFunction flyFuncStion) {
		this.flyFuncStion = flyFuncStion;
	}

	public void performFly() {
		if(flyFuncStion!=null) {
			flyFuncStion.fly();
	   }else {
		   System.out.println("I can't fly!!");
	   }
		
		
	}
	
	public abstract void walk();
	
	public abstract void swim();
	
	
}
