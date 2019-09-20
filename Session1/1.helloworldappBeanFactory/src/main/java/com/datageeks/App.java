package com.datageeks;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.datageeks.beans.HelloWorldBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("applicationContext.xml");
    	BeanFactory springContainer = new XmlBeanFactory(resource);
    	
    	HelloWorldBean bean = springContainer.getBean(HelloWorldBean.class);
    	bean.getInfo();
    }
}
