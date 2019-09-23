package com.datageeks.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SampleProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof SampleBean)
		{
			System.out.println(" From BeanPostProcessor :: SampleBean PRE-Processing Logic is Successfull id ="+beanName);
			
		}
		
		if(bean instanceof DemoBean)
		{
			System.out.println(" From BeanPostProcessor :: DemoBean PRE-Processing Logic is Successfull id ="+beanName);
			
		}
		
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if(bean instanceof SampleBean)
		{
			System.out.println(" From BeanPostProcessor :: SampleBean POST-Processing Logic is Successfull id ="+beanName);
			
		}
		
		if(bean instanceof DemoBean)
		{
			System.out.println(" From BeanPostProcessor :: DemoBean POST-Processing Logic is Successfull id ="+beanName);
			
		}
		
		return bean;
	}
	
}
