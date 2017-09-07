package com.pwc.desingerPattern.simpleFactory;

public class OperationDevide extends AbstractOperation {

	@Override
	public void processResult(int a, int b) {
		// TODO Auto-generated method stub
		try{
			int result = a/b;
			System.out.println("The result of Devide Operation is "+result);
		}catch(ArithmeticException e){
			System.out.println("info yanjikun"+e.getMessage());
		}

	}

}
