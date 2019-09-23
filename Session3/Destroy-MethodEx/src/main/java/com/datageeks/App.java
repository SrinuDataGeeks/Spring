package com.datageeks;

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
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	SampleBean s = container.getBean(SampleBean.class);
    	s.getInfo();
    	
    	container.registerShutdownHook();
    }
}
