package com.pwc.desingerPattern.simpleFactory;

public class OperationAdd extends AbstractOperation {

	@Override
	public void processResult(int a, int b) {
		// TODO Auto-generated method stub
		int result = a+b;
		System.out.println("The result of Add Operation is "+result);
	}



}
