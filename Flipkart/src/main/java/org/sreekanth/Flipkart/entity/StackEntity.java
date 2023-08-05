package org.sreekanth.Flipkart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stac_info")
public class StackEntity implements Serializable {
	
	@Id
	@GenericGenerator(name="auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name="alt_key")
	private long altkey; 
	
	@Column(name="product_id")
	private String productId;
	
	@Column(name="quantity")
	private String quantity;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
