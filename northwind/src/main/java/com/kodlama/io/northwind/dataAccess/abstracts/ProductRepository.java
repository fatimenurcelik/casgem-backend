package com.kodlama.io.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlama.io.northwind.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{
	List <Product> findByName(String name);
}
