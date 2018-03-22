package com.pwc.DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;

public class ProxyHandler implements InvocationHandler {
protected  Object object;

public ProxyHandler(Object obj) {
	
	this.object = obj;
	
	
}

@Override
public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

	   Object result = method.invoke(object, args);
	   return result;
	 
/*	 if ("hasParameterMethod".equals(method.getName())) {
			System.out.println("Before the target method.");
			// execute this target method.
			Object result = method.invoke(object, args);
			//it can do something handle after execute the target method.
			System.out.println("After the target method.");
			return result;

	  }else {
		   Object result = method.invoke(proxy, args);
		   return result;
	 }*/
	
}
}
