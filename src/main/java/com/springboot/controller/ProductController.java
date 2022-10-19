package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;

@RestController
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
		
	}
	@PostMapping("/addProducts")
	public List<Product> addProduct(@RequestBody List<Product> products) {
		return service.saveProducts(products);
		
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id){
		return service.getProductById(id);
	}
	@GetMapping("/products/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
//	@PutMapping
//	public Product updateProduct(@RequestBody Product product) {
//		return service.updateProduct(product);
//		
//	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	

}
