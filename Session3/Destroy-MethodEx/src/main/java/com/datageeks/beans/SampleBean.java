package com.datageeks.beans;

public class SampleBean {
	
	private SampleBean()
	{
		System.out.println(" SampleBean Object created ");
	}
	
	public void destroy()
	{
		System.out.println(" Rersouce Deallocation logic is successfull From Sample destory()");
	}
	
	public void getInfo()
	{
		System.out.println(" From getInfo() :: Demo on SpringBean Initialization !!!");
	}


}
