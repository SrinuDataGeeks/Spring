package com.datageeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.beans.CountryBean;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    	CountryBean bean = container.getBean(CountryBean.class);
    	System.out.println(" Demo On Annotations !!!");
    	
    	bean.getCountryInfo();
    }
}
