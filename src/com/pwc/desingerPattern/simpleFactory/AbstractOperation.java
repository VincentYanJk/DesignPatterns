package com.pwc.desingerPattern.simpleFactory;

public abstract class AbstractOperation implements IOperation {
	protected int numberA;
	protected int numberB;


	public AbstractOperation(){}
	public AbstractOperation(String a){}
	
	public static IOperation createOperation(String type){
		IOperation instance = null;
		
		switch(type){
		
		case "+":{
			instance = new OperationAdd();	
		break;	
		}
		case "-":{
			instance = new OperationSub();	
		break;	
		}
		case "/":{
			instance = new OperationDevide();	
		break;	
		}
		default :{
			throw new IllegalArgumentException("this is not supported Operation "+type);
		}
		}
		
		
		return instance ;
	}
}
