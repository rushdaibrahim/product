package com.springboot.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
   private String id;
   private String name;
   private String quantity;
   private String price;

   public String getQuantity() {
	return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
}