package com.pwc.reflect.demo.demo2;

public class UserInfo {

	public String name;
	public String sex;
	public String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserInfo [userId=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	public UserInfo() {
	}
	
	
}
