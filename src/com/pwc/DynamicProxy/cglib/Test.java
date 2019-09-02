package com.pwc.DynamicProxy.cglib;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject realSubject = new RealSubject();
		CglibProxy proxy = new CglibProxy(realSubject);
		RealSubject real = (RealSubject)proxy.getCglibProxy(realSubject);
		real.noParameterMethod();
	}

}
