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
    	
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeDAO dao = container.getBean(EmployeeDAO.class);
    	
    	System.out.println("\n\n Get Emp Info => "+dao.get(111));
    	
    	
    	System.out.println("\n\n GetAll  => "+dao.getAll());

    }
}
