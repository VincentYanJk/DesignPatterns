package com.pwc.DynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;



public class CglibProxy implements MethodInterceptor {

	private Object target;//需要代理的目标对象
	
	public CglibProxy(Object obj) {
		
		this.target = obj;	
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		
		   Object result = method.invoke(obj, args);
		   System.out.println("invoke the method");
		   return result;
	}

	
    //定义获取代理对象方法
    public Object getCglibProxy(Object objectTarget){
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);// 设置回调 
        Object result = enhancer.create();//创建并返回代理对象
        return result;
    }



}
