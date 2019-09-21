package com.datageeks.bean;

public class ProductBean {

	private String message = null;
	private Stock stockRef = null;
	
	public ProductBean(String message, Stock stockRef) {
		super();
		this.message = message;
		this.stockRef = stockRef;
	}
	
	public void getInfo()
	{
		System.out.println(message);
	}
	
	
		
}
