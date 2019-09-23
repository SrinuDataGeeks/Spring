package com.datageeks.beans;

public class SampleBean {
	
	private SampleBean()
	{
		System.out.println(" SampleBean Object created ");
	}
	
	public void init()
	{
		System.out.println(" Initilization logic is successfull From Sample init()");
	}
	
	public void getInfo()
	{
		System.out.println(" From getInfo() :: Demo on SpringBean Initialization !!!");
	}

}
