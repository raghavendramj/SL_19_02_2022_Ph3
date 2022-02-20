package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Product;
import com.simplilearn.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping
	Product addProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@GetMapping
	List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/{id}")
	Product getProduct(@PathVariable("id") Long id) {
		return productService.getProduct(id);
	}

	@GetMapping("/name")
	List<Product> getProductsByName(@RequestParam("productName") String productName) {
		return productService.getProductsByName(productName);
	}

	@GetMapping("/price")
	List<Product> getProductsByPrice(@RequestParam("productPrice") Long productPrice) {
		return productService.getProductsByPrice(productPrice);
	}

	@PutMapping("/{id}")
	Product udpateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	@DeleteMapping("/{id}")
	Product deleteProduct(@PathVariable("id") Long id) {
		return productService.deleteProduct(id);
	}
}
