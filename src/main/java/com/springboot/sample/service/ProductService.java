package com.springboot.sample.service;

import java.util.Collection;
import java.util.Optional;

import com.springboot.sample.model.Product;

public interface ProductService {

	public abstract Collection<Product> getProducts();

	public abstract void createProduct(Product product);

	public abstract void updateProduct(String id, Product product);

	public abstract void deleteProduct(String id);

	//public abstract Product findProductById(String id);
	
}
