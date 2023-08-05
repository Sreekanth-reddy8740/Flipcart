package org.sreekanth.Flipkart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="order_info")
public class OrderEntity implements Serializable {
	
	@Id
	@GenericGenerator(name="auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name="alt_key")
	private long altkey; 
	
	@Column(name="product_id")
	private String productid;
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="total_price")
	private String totalPrice;
	
	@Column(name="sold_date")
	private String soldDate;
	
	@Column(name="payment_mode")
	private String paymentMode;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

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

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(String soldDate) {
		this.soldDate = soldDate;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	

}
