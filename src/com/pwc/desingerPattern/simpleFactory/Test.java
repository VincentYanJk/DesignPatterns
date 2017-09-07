package com.pwc.desingerPattern.simpleFactory;

public class Test {
	
	
	
public static void main(String args[]){
	IOperation operation = null;
	operation = AbstractOperation.createOperation("+");
	operation.processResult(10, 0);
	
	
}
}
