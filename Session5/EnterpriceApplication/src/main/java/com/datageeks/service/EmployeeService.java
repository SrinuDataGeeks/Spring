package com.datageeks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datageeks.dao.EmployeeDAO;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO = null;
	
	public void getService()
	{
		System.out.println(" From EmployeeService : getService() ");
		employeeDAO.getService();
	}

}
