package com.pwc.designerPattern.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteComponent component = new ConcreteComponent();
		
		ConcreteComponentA decoratorA = new ConcreteComponentA(component);
		
		decoratorA.method();
		decoratorA.methodA();
		
		
		
		ConcreteComponentB decoratorB = new ConcreteComponentB(component);
		
		decoratorB.method();
		decoratorB.methodB();
		
		
		
	}

}
