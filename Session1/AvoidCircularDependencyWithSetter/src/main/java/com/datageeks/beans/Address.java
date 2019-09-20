package com.datageeks.beans;

public class Address {
	
	private String city = null;
	
	private Employee employee = null;

	public Address() {
	}

	
	public void setCity(String city) {
		this.city = city;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getCity()
	{
		return city;
	}

}
