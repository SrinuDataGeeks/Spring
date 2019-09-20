package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.beans.HelloWorldBean;

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
    	
    	System.out.println("\n\n Request 1");
    	
    	HelloWorldBean bean1  = springContainer.getBean(HelloWorldBean.class);
    	bean1.getInfo();
    	
    	System.out.println("\n\n Request 2");
    	HelloWorldBean bean2  = springContainer.getBean(HelloWorldBean.class);
    	
    	System.out.println("\n\n Request 3");
    	HelloWorldBean bean3  = springContainer.getBean(HelloWorldBean.class);
    }
}
