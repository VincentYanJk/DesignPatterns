package com.pwc.designerPattern.decorator;

public class ConcreteComponentB extends Decorator {

	public ConcreteComponentB(Component component) {
		super(component);
	}
	
	public void method() {
		System.out.println("ConcreteComponentB: Start invoke original method.");
		super.method();
		System.out.println("ConcreteComponentB: End invoke original method.");
	}
	
	
	public void methodB() {
		System.out.println("ConcreteComponentB: This is extend function.");

	}
	

}
