package com.datageeks.beans;

public class Employee {
	private String empName = null;
	private Address address = null;
	public Employee() {
	}
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void display()
	{
		System.out.println("EmpName :: "+empName);
		System.out.println("Address :: "+address.getCity());
		
		
	}
		
}
