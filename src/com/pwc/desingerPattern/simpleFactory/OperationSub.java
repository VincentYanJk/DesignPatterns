package com.pwc.desingerPattern.simpleFactory;

public class OperationSub extends AbstractOperation {

	@Override
	public void processResult(int a, int b) {
		// TODO Auto-generated method stub
		int result = a-b;
		System.out.println("The result of sub Operation is "+result);
	}

}
