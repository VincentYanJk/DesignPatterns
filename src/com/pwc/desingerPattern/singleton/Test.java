package com.pwc.desingerPattern.singleton;

public class Test {

	public static void main(String[] strgs) {
		
	//verify hungry singleton	
	//Singleton_Hungry.instance.getInstance().verify();
		
   //verify  lazy load  singleton	
		Singleton_LazyLoad.getInstance().verify();
	}
	
}
