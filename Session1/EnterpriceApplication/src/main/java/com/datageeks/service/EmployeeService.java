package com.datageeks.service;

import com.datageeks.dao.EmployeeDAO;

public class EmployeeService {

	private EmployeeDAO employeeDAORef = null;
	
	public EmployeeService() {
	}

	public void setEmployeeDAORef(EmployeeDAO employeeDAORef)
	{
		this.employeeDAORef = employeeDAORef;
	}
	
	public void getInfo()
	{
		employeeDAORef.getInfo();
		System.out.println(" From EmployeeService :: I implement  Bussiness Logics ::");
		
	}
	
}
