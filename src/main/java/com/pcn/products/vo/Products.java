package com.pcn.products.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Products")
public class Products {
	
	@Id
	private String productId;
	
	private String productName;
	private String price;
	
	
	public Products() {
		
	}
	
	public Products(String productId, String name, String price){
		this.productId=productId;
		this.productName=name;
		this.price=price;
	}
	
	
	
	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	
	
	
	


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	

}
