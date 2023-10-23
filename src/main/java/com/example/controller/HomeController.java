package com.example.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.ProductService;
import com.example.model.Product;
@Controller
public class HomeController {

	private ProductService productService;
	
	public HomeController(ProductService productService) {
		this.productService=productService;
		System.out.println("Home Controller Object Created");
	}
	
	@RequestMapping("/register")
	public String RegisterPage() {
		return "Register.jsp";
	}
	
	@RequestMapping("/save")
	public String save(Product p) {
		productService.saveProduct(p);
		return "Registration.jsp";
	}
	@RequestMapping("/ViewAllProducts")
	public ModelAndView allProducts() {
		List<Product> allProducts = productService.viewProduct();
		return new ModelAndView("ViewAllProducts").addObject("products", allProducts);
	}
}
