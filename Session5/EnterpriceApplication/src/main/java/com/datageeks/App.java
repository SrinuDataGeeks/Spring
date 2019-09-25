package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.controller.EmployeeController;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeController bean = container.getBean(EmployeeController.class);
    	
    	bean.getService();	
    }
}
