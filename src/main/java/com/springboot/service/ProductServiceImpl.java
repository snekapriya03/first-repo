package com.springboot.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Product;
import com.springboot.repository.Productrepository;



@Service
public class ProductServiceImpl  implements ProductService{
	@Autowired
	//post method
	private Productrepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	//get method
	
	public List<Product> getProducts(){
		return repository.findAll();
		}
	
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
		}
	public Product getProductByName(String name){
		return repository.findByName(name);
		}
	
	//delete method
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product removed!!";
		
	}
	//update method 
//	public Product updateProduct(Product product) {
//		Product existingProduct=repository.findById(product.getId());
//		existingProduct.setName(product.get)
//	}


}
