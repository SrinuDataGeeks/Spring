package com.datageeks.bean;

public class Stock {
	
	private ProductBean productBeanRef = null;

	public Stock()
	{
		
	}
	
	

	public Stock(ProductBean productBeanRef) {
		super();
		this.productBeanRef = productBeanRef;
	}



	public void getStockInfo()
	{
		System.out.println(productBeanRef.getInfo());
	}

}
