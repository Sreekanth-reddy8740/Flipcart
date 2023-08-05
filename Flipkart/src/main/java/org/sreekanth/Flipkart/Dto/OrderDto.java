package org.sreekanth.Flipkart.Dto;

import java.io.Serializable;

public class OrderDto implements Serializable{

	private String productid;
	
	private String quantity;
	
	private String paymentMode;

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}
