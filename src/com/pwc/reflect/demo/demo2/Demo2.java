package com.pwc.reflect.demo.demo2;

public class Demo2 {

	public static void main(String[] strs){
		
		
	Class<?> c1 = UserInfo.class;
	
	UserInfo user = null;
	try {
		user = (UserInfo)c1.newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	user.setId("1");
	user.setName("jason");
	user.setSex("male");
	user.toString();
		
		
	}
	
}
