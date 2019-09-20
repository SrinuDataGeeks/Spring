package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 	
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");

    	Employee emp = springContainer.getBean(Employee.class);
    	emp.display();
    }
}
