package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Product;

@Repository
public interface Productrepository extends JpaRepository<Product, Integer> {

	Product findByName(String name) ;

}
