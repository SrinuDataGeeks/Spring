package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	
    		
    	System.out.println("\n\n => ResultSetExtractor "+dao.getAllResultSetExtractor());
    	
    	System.out.println("\n\n => RowCallbackHandler "+dao.getAllRowCallbackHandler());
    	
    	System.out.println("\n\n => RowMapper with List "+dao.getAllRowMapper());
    	
    	System.out.println("\n\n =>  RowMapper with Object "+dao.getAllRowMapper2(111));
    	
    	
    }
}
