package com.datageeks.beans;

public class Address {
	
	private String city = null;
	
	private Employee employee = null;

	public Address(String city, Employee employee) {
		super();
		this.city = city;
		this.employee = employee;
	}
	
	public String getCity()
	{
		return city;
	}

}
