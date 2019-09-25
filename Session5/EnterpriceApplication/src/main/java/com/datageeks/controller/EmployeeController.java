package com.datageeks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.datageeks.service.EmployeeService;

@Controller	
public class EmployeeController 
{

		private EmployeeService employeeService = null;

			@Autowired
		public EmployeeController(EmployeeService employeeService) {
			super();
			this.employeeService = employeeService;
		}
			
			public void getService()
			{
				System.out.println("From EmployeeController :: getService()");
				employeeService.getService();
				
			}
		
		
	
}
