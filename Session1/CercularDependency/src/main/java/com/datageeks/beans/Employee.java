package com.datageeks.beans;

public class Employee {
	private String empName = null;
	private Address address = null;
	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.address = address;
	}
	
	
	public void display()
	{
		System.out.println("EmpName :: "+empName);
		System.out.println("Address :: "+address.getCity());
		
		
	}
		
}
