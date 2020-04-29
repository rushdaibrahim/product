package com.springboot.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sample.model.Product;
import com.springboot.sample.service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductServiceController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/products")
	public ResponseEntity<Object> getProduct() {
		return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/createproduct", method = RequestMethod.POST)
	public ResponseEntity<Object> createProduct(@RequestBody Product product) {
		productService.createProduct(product);
		return new ResponseEntity<>("created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/updateproduct/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
		productService.updateProduct(id,product);
		return new ResponseEntity<>("updated successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteproduct/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id) {
		productService.deleteProduct(id);
		return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
	}

}