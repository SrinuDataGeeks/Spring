package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.dao.EmployeeBean;
import com.datageeks.dao.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	Drop Table Employee;
    	Create Table Employee(EMP_ID number(10) Primary Key , EMP_NAME varchar2(20),EMP_SAL number(10,2));
    	*/
    	
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeDAO dao = container.getBean(EmployeeDAO.class);
    	
    		/*
    		 
    	 EmployeeBean employeeBean = new EmployeeBean(222, "Srikanth", 75000f);
    		dao.save(employeeBean);
    		System.out.println(" Save Successfull !!!");
    		
    		*/
    	 
    		/*
    	
    	Integer count = dao.delete(111);
    	if(count > 0)
    	{
    		System.out.println(" Employee Deleted Successfully");
    	}else
    	{
    		System.out.println(" Employee ID does not exist ");
    	}
    		*/
    	
    	/*
    	
    	 EmployeeBean employeeBean = new EmployeeBean(222, "Srikanth K", 85000f);
 		dao.update(employeeBean);
 		System.out.println(" Update Successfull !!!");
 		
 		*/
    	
    	
    	 EmployeeBean employeeBean2 = new EmployeeBean(111, "Naresh", 75000f);
 		dao.save2(employeeBean2);
 		System.out.println(" Save Successfull !!!");
 		
 		
 		 EmployeeBean employeeBean3 = new EmployeeBean(333, "Venky", 95000f);
  		dao.save3(employeeBean3);
  		System.out.println(" Save Successfull !!!");
    }
}
