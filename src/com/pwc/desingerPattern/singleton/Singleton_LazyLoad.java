package com.pwc.desingerPattern.singleton;

/**
 * 
 * There is concurrent issue of thread safe in Singleton_LazyLoad mode.
 * 
 * */
public class Singleton_LazyLoad {

	public static Singleton_LazyLoad instance = null;

	public static Singleton_LazyLoad getInstance() {

		if (instance == null)
			instance = new Singleton_LazyLoad();
		return instance;

	}
	
	public void verify() {
		
		System.out.println("invoke method successfully!");
		
		
	}

}
