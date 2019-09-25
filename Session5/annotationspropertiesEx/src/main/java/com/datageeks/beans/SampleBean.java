package com.datageeks.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleBean {
	private String userName = null;
	private String password = null;
	
	
	@Value("${uname}")
	public void setUserName(String userName) {
			this.userName = userName;
	}
	
	@Value("${pass}")
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SampleBean [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
