package com.pwc.DynamicProxy.cglib;


public class RealSubject {

	
	public String hasParameterMethod(String str) {
		// TODO Auto-generated method stub
		String teString = "This is real class to excute something. this method has parameter";
		return teString+str;
	}


	public String noParameterMethod() {
		// TODO Auto-generated method stub
		return "This is real class to excute something. this method no parameter";
	}

}
