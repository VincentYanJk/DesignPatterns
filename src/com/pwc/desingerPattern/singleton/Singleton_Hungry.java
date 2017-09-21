package com.pwc.desingerPattern.singleton;

/**
 * 
 * Hungry singleton
 * 
 * 
 */

public class Singleton_Hungry {

	public static Singleton_Hungry instance = new Singleton_Hungry();

	private Singleton_Hungry() {
	}

	public Singleton_Hungry getInstance() {
		return instance;
	}
	
	public void verify() {
		
		System.out.println("invoke method successfully!");
		
		
	}

}
