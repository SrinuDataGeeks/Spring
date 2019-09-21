package com.datageeks.bean;

public class ProductBean {

	private Integer productId = null;
	private String productName = null;
	private Float productPrice = null;
	
	public ProductBean()
	{
		
	}
	
	
	
	public ProductBean(Integer productId, String productName, Float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}



	public String getInfo() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
		
}
