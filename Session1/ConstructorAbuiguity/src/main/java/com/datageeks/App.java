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
    	System.out.println(" Demo Spring Application");
    	
    	
    	ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");

    	System.out.println(springContainer.getBean(Employee.class));
    }
}
