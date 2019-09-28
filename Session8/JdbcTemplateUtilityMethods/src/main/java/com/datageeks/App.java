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
    	System.out.println("\n\n => getAll()	 	:"+dao.getAll());
    	System.out.println("\n\n =>  getEmpNameById()  		:"+dao.getEmpNameById(111));
    	System.out.println("\n\n =>  getEmpById()	   :"+dao.getEmpById(222));
    	System.out.println("\n\n =>  getMax()  :"+dao.getMax());

    	
    	
    }
}
