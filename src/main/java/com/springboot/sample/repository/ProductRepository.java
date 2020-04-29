package com.springboot.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.sample.model.Product;

public interface ProductRepository extends CrudRepository<Product, String>{

}
