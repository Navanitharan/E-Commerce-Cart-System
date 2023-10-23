package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.model.Product;

@Service
public class ProductService {

	private ProductRepository pr;
	
	public ProductService(ProductRepository productRepository) {
		this.pr=productRepository;
		System.out.println("Product Service Created");
	}
	
	public void saveProduct(Product p) {
		pr.save(p);
	}
	
	public List<Product> viewProduct(){
		List<Product> allProducts = (List<Product>)pr.findAll();
		return allProducts;
	}

}
