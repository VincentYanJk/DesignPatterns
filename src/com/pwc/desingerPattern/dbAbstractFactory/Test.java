/**
 * 
 */
package com.pwc.desingerPattern.dbAbstractFactory;

/**
 * @author jyan062
 *
 */
public class Test {
	
	public static void main(String[] strs){
		
		User user = new User();
		
		IDBCreateFactory factory = new MySqlCreateFactory();
		
		IUser iuser =  factory.CreateUser();
		
		iuser.insert(user);
		
		iuser.get(1);
		
		
	}

}
