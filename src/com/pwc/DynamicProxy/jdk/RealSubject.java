package com.pwc.DynamicProxy.jdk;

import com.pwc.DynamicProxy.jdk.Subject;

public class RealSubject implements Subject{

	@Override
	public String doSomething() {
		// TODO Auto-generated method stub
		String teString = "This is real class to excute something.";
		return teString;
	}

}
