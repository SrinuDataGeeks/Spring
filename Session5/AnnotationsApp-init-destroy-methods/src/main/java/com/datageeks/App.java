package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.beans.SampleBean;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	SampleBean	 bean = container.getBean(SampleBean.class);
    	
    	bean.getService();
    	
    	container.registerShutdownHook();
    }	
}
