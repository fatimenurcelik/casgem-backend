package com.kodlama.io.northwind.business.abstracts;

import java.util.List;

import com.kodlama.io.northwind.business.requests.categories.CreateCategoryRequest;
import com.kodlama.io.northwind.business.requests.categories.UpdateCategoryRequest;
import com.kodlama.io.northwind.business.responses.categories.CreateCategoryResponse;
import com.kodlama.io.northwind.business.responses.categories.DeleteCategoryResponse;
import com.kodlama.io.northwind.business.responses.categories.GetAllCategoriesResponse;
import com.kodlama.io.northwind.business.responses.categories.UpdateCategorytResponse;

public interface CategoryService {
	List <GetAllCategoriesResponse> getAll();
	CreateCategoryResponse add(CreateCategoryRequest createCategoryResponse);
	UpdateCategorytResponse update (UpdateCategoryRequest updateCategoryResponse);
	DeleteCategoryResponse deleteById(int id);
}