package com.datageeks.beans;

public class ProductBean {

	private Integer productId = null;
	private String productName = null;
	private Float productPrice = null;

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}
