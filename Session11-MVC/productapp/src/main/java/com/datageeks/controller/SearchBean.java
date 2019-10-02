package com.datageeks.controller;

import java.io.Serializable;

public class SearchBean implements Serializable{
	
	private String productName;
	
	public SearchBean()
	{
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
}
