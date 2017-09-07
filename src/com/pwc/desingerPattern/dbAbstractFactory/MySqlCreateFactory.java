package com.pwc.desingerPattern.dbAbstractFactory;

public class MySqlCreateFactory implements IDBCreateFactory {

	@Override
	public IUser CreateUser() {
		// TODO Auto-generated method stub
		
		return new MySqlUser();
	}

}
