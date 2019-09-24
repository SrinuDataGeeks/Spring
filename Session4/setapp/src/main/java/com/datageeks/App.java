package com.datageeks;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.datageeks.beans.ProductBean;
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
 SampleBean s = container.getBean(SampleBean.class);

Set<ProductBean> productSet = s.getProductSet();
 for(ProductBean p :productSet)
 {
	 System.out.println(p);
 }

    }
}
