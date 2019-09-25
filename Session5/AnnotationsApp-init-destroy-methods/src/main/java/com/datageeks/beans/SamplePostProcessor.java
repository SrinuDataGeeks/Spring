package com.datageeks.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class SamplePostProcessor  implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\n\n Initialization PAhse :: \n"+bean.getClass()+ " PRE-PROCESSING LOGIC executed");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass()+ " POST-PROCESSING LOGIC executed");
		return bean;
	}

}
