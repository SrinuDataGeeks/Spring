package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.beans.SampleBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
  ApplicationContext container =  	new ClassPathXmlApplicationContext("applicationContext.xml");
 System.out.println( container.getBean(SampleBean.class).getProductList());

    }
}
