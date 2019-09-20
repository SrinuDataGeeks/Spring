package com.datageeks.beans;

public class HelloWorldBean {
	
	private HelloWorldBean()
	{
		System.out.println(" HelloWorldBean Object is created");
		
	}

		public void getInfo()
		{
			System.out.println(" Welcome to Spring Framework.");
		}
}
