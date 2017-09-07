/**
 * 
 */
package com.pwc.desingerPattern.dbAbstractFactory2;

/**
 * @author jyan062
 *
 */
public class SqlserverUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		user.setID("1");
		user.setName("SqlserverUser name");
		System.out.println("Insert SQL server user successfuly");
		
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		System.out.println("Get SQL server user successfuly by ID" +id);
	}

}
