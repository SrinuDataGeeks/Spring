package com.datageeks.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SampleProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("\n\n Initialization Phase :: \n"+bean.getClass()+ "  PRE-PROCESSING logic complted ");
		
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println(bean.getClass()+ "  POST-PROCESSING logic complted ");
		
		return bean;
		
	}
	
}
