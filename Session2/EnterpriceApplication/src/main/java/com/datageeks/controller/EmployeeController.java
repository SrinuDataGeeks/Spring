package com.datageeks.controller;

import com.datageeks.service.EmployeeService;

public class EmployeeController {
	private EmployeeService employeeServiceRef = null;
	private String message = null;
	
	
	public EmployeeController(String message ,EmployeeService employeeServiceRef) {
		super();
		this.employeeServiceRef = employeeServiceRef;
		this.message = message;
	}

	public EmployeeController()
	{
		
	}
	
	public void getInfo()
	{
		System.out.println(message);
		employeeServiceRef.getInfo();
		System.out.println(" Hi From  EmployeeController !!! Implement Presentation logics");
	}

}
