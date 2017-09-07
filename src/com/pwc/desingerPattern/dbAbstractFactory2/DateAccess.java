package com.pwc.desingerPattern.dbAbstractFactory2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.lang.reflect.AccessibleObject;;

public class DateAccess {
//public static final String DB = "MS";
//public static final String DB = "SS";

public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
	IUser User =null;
    Properties properties = new Properties();
    try {
        properties.load(new FileInputStream("src/nameMapping.properties"));
    } catch (IOException e) {
        e.printStackTrace();
    }

	User = (IUser) Class.forName(properties.getProperty("MS")).newInstance();
	
	
	/*switch(DB){
	case "MS":{
		User = new MySqlUser();
		break;
	}
	case"SS":{
		User = new SqlserverUser();
		break;	
	}
	default:{
		throw new IllegalArgumentException("this is not supported Operation "+DB);
	}
	}*/
	
	
	return User;
}
}
