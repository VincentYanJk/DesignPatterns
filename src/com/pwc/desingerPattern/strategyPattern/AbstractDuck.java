package com.pwc.desingerPattern.strategyPattern;

public abstract class AbstractDuck {
	
	public IFlyFunction flyFunction;
	
	public abstract void walk();
	
	public abstract void swim();
	
	
}
