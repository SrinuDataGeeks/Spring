package com.datageeks.beans;

public class SampleBean {
	private String userName = null;
	private String password = null;
	
	
	public void setUserName(String userName) {
			this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SampleBean [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
