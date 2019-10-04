package com.datageeks.controller;

import java.io.Serializable;

public class UserBean implements Serializable{

		private String username ;
		private String[] qly ;
		private String gender;
		private String country;
		
		public UserBean()
		{
			
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String[] getQly() {
			return qly;
		}

		public void setQly(String[] qly) {
			this.qly = qly;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		
		
}
