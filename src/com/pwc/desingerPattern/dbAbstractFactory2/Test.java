/**
 * 
 */
package com.pwc.desingerPattern.dbAbstractFactory2;

/**
 * @author jyan062
 *
 */
public class Test {
	
	public static void main(String[] strs) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
	
		User user = new User();
		DateAccess db = new DateAccess();
		
		IUser newUser = db.createUser();
		
		newUser.insert(user);
		
		newUser.get(1);
		
		
	}

}
