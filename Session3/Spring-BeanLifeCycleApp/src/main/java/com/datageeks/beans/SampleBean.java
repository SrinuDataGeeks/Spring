package com.datageeks.beans;

public class SampleBean {
	private String message = null;
	
	private SampleBean()
	{
		System.out.println("\n\nInstatiation Phase :: \n SampleBean Object created ");
	}
	
	public void setMessage(String message)
	{
		System.out.println(" Dependency Injection is completed !!!");
		this.message = message;
	}
	
	public void init()
	{
		System.out.println(" From SampleBean init() :: Initilization logic is successfull ");
	}
	
	public void getService()
	{
		System.out.println("\n\n Servicing Phase :: \nReady to give Services "+message);
	}
	
	public void destroy()
	{
		System.out.println("\n\n Destruction Phase :: \nObject is removed !!! invokes the SampleBean destroy() method ");
	}

}
