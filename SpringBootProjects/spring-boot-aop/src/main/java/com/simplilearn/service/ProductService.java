package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Product;

public interface ProductService{
	//Create
	Product createProduct(Product product); // save()
	
	//Read
	List<Product> getProducts(); // findAll()
	Product getProduct(Long id);
	List<Product> getProductsByName(String name);
	List<Product> getProductsByPrice(long price);
	
	//Update
	Product updateProduct(Long id, Product product);
	
	//Delete
	Product deleteProduct(Long id);
}
