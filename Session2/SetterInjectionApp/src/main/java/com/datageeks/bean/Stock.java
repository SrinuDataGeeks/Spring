package com.datageeks.bean;

public class Stock {
	
	private ProductBean productBeanRef = null;

	public Stock()
	{
		
	}
	
	
	public void setProductBeanRef(ProductBean productBeanRef) {
		this.productBeanRef = productBeanRef;
	}


	public void getStockInfo()
	{
		System.out.println(productBeanRef.getInfo());
	}

}
