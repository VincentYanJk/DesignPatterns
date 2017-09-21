package com.pwc.desingerPattern.singleton;

/**
 * 
 * There is concurrent issue of thread safe in Singleton_LazyLoad node.
 * 
 * */
public class Singleton_LazyLoad_Safe {

	public static Singleton_LazyLoad_Safe instance = null;

	public static Singleton_LazyLoad_Safe getInstance() {

		if (instance == null) {
			
			synchronized(Singleton_LazyLoad_Safe.class) {
			instance = new Singleton_LazyLoad_Safe();
			
			}
	     }
		return instance;

	}
	
	
	public void verify() {
		
		System.out.println("invoke method successfully!");
		
		
	}

}
