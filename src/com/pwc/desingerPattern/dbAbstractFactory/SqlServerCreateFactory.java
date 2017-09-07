package com.pwc.desingerPattern.dbAbstractFactory;

public class SqlServerCreateFactory implements IDBCreateFactory {

	@Override
	public IUser CreateUser() {
		// TODO Auto-generated method stub
		
		return new SqlserverUser();
	}

}
