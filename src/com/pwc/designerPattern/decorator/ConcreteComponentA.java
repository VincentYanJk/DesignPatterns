package com.pwc.designerPattern.decorator;

public class ConcreteComponentA extends Decorator {

	public ConcreteComponentA(Component component) {
		super(component);
	}
	
	public void method() {
		System.out.println("ConcreteComponentA : Start invoke original method.");
		super.method();
		System.out.println("ConcreteComponentA : End invoke original method.");
	}
	
	
	public void methodA() {
		System.out.println("ConcreteComponentA : This is extend function.");

	}
	

}
