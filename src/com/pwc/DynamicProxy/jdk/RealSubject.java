package com.pwc.DynamicProxy.jdk;

import com.pwc.DynamicProxy.jdk.Subject;

public class RealSubject implements Subject{

	@Override
	public String hasParameterMethod(String str) {
		// TODO Auto-generated method stub
		String teString = "This is real class to excute something. this method has parameter";
		return teString+str;
	}

	@Override
	public String noParameterMethod() {
		// TODO Auto-generated method stub
		return "This is real class to excute something. this method no parameter";
	}

}
