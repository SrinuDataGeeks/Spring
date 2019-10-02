package com.datageeks.controller;

import java.io.Serializable;

public class UserBean implements Serializable{
	
	private String username =  null;
	
	
	public UserBean()
	{
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	
}
