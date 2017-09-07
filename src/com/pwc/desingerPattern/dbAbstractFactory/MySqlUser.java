/**1
 * 
 */
package com.pwc.desingerPattern.dbAbstractFactory;

/**
 * @author jyan062
 *
 */
public class MySqlUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		user.setID("1");
		user.setName("MySql name");
		System.out.println("Insert MySql user successfuly");
		
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		System.out.println("Get MySql user successfuly by ID " +id);
	}

}
