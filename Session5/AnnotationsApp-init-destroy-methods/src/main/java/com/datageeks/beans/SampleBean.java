package com.datageeks.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleBean {
	
	private String message = null;

		@Value(" Working with init and destroy methods")
	public void setMessage(String message) {
		this.message = message;
		System.out.println(" Dependency Injection is completed");
	}

	public SampleBean() {
		System.out.println("\n\n Instatiation Pahse :\n Sample Bean Object is created");
		
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println(" From SampleBean init() : Initialization is successfull");
	}
	public void getService()
	{
		System.out.println("\n\n Servicing Phase:\n Message :: "+message);
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println(" \n\n Destruction Phase :\n SampleBean Object deleted \n From SampleBean destroy() : Resource deallocation is successfull");
	}
	

}
