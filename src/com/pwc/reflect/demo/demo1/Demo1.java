package com.pwc.reflect.demo.demo1;

public class Demo1 {
//Create instance by reflect
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class c1 = Class.forName("java.lang.Integer");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("forName出错");
		}
		
		Integer i = 1;
		Class c2 = i.getClass();
		System.out.println(c2.getSimpleName());
		
		
		Class c3 = int.class;
		
		System.out.println(c3.getSimpleName());
	}

}
