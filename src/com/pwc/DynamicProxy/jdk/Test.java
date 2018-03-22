package com.pwc.DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	
public static void main(String[] strs) {
	
	Subject  sub = new RealSubject();
	InvocationHandler invoke = new ProxyHandler(sub);
	
	Subject subProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
			                                               new Class[] {Subject.class},                                                                invoke);
	System.out.println(subProxy.hasParameterMethod("qqq"));
	System.out.println(subProxy.noParameterMethod());
  }
}
