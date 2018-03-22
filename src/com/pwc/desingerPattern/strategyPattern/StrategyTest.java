package com.pwc.desingerPattern.strategyPattern;


public class StrategyTest {

	public static void main(String[] args) {
		AbstractDuck duck = new DuckSon1();
		duck.setFlyFuncStion(new LowFly());
		duck.performFly();
		duck.walk();
	
	}

	
}
