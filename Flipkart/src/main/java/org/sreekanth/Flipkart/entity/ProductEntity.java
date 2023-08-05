package org.sreekanth.Flipkart.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product_info")
public class ProductEntity implements Serializable {
	
	@Id
	@GenericGenerator(name="auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name="alt_key")
	private long altkey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="price")
	private String price;
	
	@Column(name="description")
	private String description;
	
	@Column(name="manfacture_date")
	private String manufactureDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id")
	private StackEntity stackEntity;
	//private OrderEntity orderEntity;
	
	
	public long getAltkey() {
		return altkey;
	}
	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public StackEntity getStackEntity() {
		return stackEntity;
	}
	public void setStackEntity(StackEntity stackEntity) {
		this.stackEntity = stackEntity;
	}
//	public OrderEntity getOrderEntity() {
//		return orderEntity;
//	}
//	public void setOrderEntity(OrderEntity orderEntity) {
//		this.orderEntity = orderEntity;
//	}
}
