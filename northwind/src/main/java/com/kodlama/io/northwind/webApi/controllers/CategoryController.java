package com.kodlama.io.northwind.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.northwind.business.abstracts.CategoryService;
import com.kodlama.io.northwind.business.requests.categories.CreateCategoryRequest;
import com.kodlama.io.northwind.business.requests.categories.UpdateCategoryRequest;
import com.kodlama.io.northwind.business.responses.categories.CreateCategoryResponse;
import com.kodlama.io.northwind.business.responses.categories.DeleteCategoryResponse;
import com.kodlama.io.northwind.business.responses.categories.GetAllCategoriesResponse;
import com.kodlama.io.northwind.business.responses.categories.UpdateCategorytResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/categories")
public class CategoryController {
	
	private CategoryService categoryService;
	
	@GetMapping("/getall")
	public List<GetAllCategoriesResponse> getAll(){
		return categoryService.getAll();
	}
	
	@PostMapping("/add")
	public CreateCategoryResponse add (@RequestBody CreateCategoryRequest createCategoryRequest) {
		return categoryService.add(createCategoryRequest);
	}
	
	@PutMapping("/update")
	public UpdateCategorytResponse update(@RequestBody UpdateCategoryRequest updateCategoryRequest) {
		return categoryService.update(updateCategoryRequest);
	}
	
	@DeleteMapping("/delete")
	public DeleteCategoryResponse deleteById(int id) {
		return categoryService.deleteById(id);
	}
}
