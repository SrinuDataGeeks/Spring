package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.controller.EmployeeController;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(" Spring Demo Application");
    	
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	EmployeeController empController =	container.getBean(EmployeeController.class);
				 
		 empController.getInfo();
    }
}