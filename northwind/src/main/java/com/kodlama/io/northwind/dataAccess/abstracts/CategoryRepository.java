package com.kodlama.io.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlama.io.northwind.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
