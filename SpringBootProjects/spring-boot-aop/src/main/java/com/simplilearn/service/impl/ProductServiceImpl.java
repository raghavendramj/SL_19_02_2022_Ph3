package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Product;
import com.simplilearn.repository.ProductRepository;
import com.simplilearn.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProduct(Long id) {
		Optional<Product> optiaonalProduct = productRepository.findById(id);

		if (optiaonalProduct.isPresent()) {
			return optiaonalProduct.get();
		}

		return null;
	}

	public List<Product> getProductsByName(String name) {
		return productRepository.getProductByName(name);
	}

	public List<Product> getProductsByPrice(long price) {
		return productRepository.getProductsByPrice(price);
	}

	public Product updateProduct(Long id, Product updatedProduct) {
		Optional<Product> optiaonalProduct = productRepository.findById(id);

		if (optiaonalProduct.isPresent()) {
			productRepository.save(updatedProduct);
			return updatedProduct;
		}
		return null;
	}

	public Product deleteProduct(Long id) {
		Optional<Product> optiaonalProduct = productRepository.findById(id);

		if (optiaonalProduct.isPresent()) {
			Product currentProduct = optiaonalProduct.get();
			productRepository.delete(currentProduct);
			return currentProduct;
		}
		return null;
	}

}
