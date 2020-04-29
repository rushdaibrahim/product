package com.springboot.sample.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.sample.exception.ProductNotFoundException;
import com.springboot.sample.model.Product;
import com.springboot.sample.repository.ProductRepository;
import com.springboot.sample.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;
	
//	private static Map<String, Product> productRepo = new HashMap<>();
//	static {
//		Product honey = new Product();
//		honey.setId("1");
//		honey.setName("Honey");
//		productRepo.put(honey.getId(), honey);
//
//		Product almond = new Product();
//		almond.setId("2");
//		almond.setName("Almond");
//		productRepo.put(almond.getId(), almond);
//	}
	
	@Override
	public Collection<Product> getProducts() {
		//return productRepo.values();
		return (Collection<Product>) productRepository.findAll();
	}

	@Override
	public void createProduct(Product product) {
		//productRepo.put(product.getId(), product);
		productRepository.save(product);
	}

	@Override
	public void updateProduct(String id, Product product) {
//		if (!productRepo.containsKey(id))
//			throw new ProductNotFoundException();
//			productRepo.remove(id);
//			product.setId(id);
//			productRepo.put(id, product);
			productRepository.save(product);
	}

	@Override
	public void deleteProduct(String id) {
		//productRepo.remove(id);
		productRepository.deleteById(id);
	}

//	@Override
//	public Optional<Product> findProductById(String id) {
//		Optional<Product> product = productRepository.findOne(id)
//		return product;
//	}

	

}
