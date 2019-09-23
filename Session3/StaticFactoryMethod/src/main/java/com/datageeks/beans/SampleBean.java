package com.datageeks.beans;

public class SampleBean {
	
	private SampleBean()
	{
		
	}
	
	public static SampleBean getSampleBean()
	{
		SampleBean s = new SampleBean();
		System.out.println("SprintBean Instatiating through Static Factory Method");
		return s;
	}
	
	public void getInfo()
	{
		System.out.println(" From getInfo :: Demo on Instatiating Bean ::");
	}

}
