package com.datageeks.bean;

public class ProductBean {

	private String message = null;
	private Stock stockRef = null;
	
	public ProductBean() {
	}
	
	
	public void setMessage(String message) {
		this.message = message;
	}


	public void setStockRef(Stock stockRef) {
		this.stockRef = stockRef;
	}


	public void getInfo()
	{
		System.out.println(message);
	}
	
	
		
}
