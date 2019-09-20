package com.datageeks.beans;

public class Employee {
	
	private Integer empId = null;
	
	private String empName = null;
	
	private Float empSal = null;

	public Employee(String empName, Float empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}

	public Employee(Integer empId, Float empSal) {
		super();
		this.empId = empId;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
		
}
