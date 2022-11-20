package com.kodlama.io.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.northwind.business.abstracts.CategoryService;
import com.kodlama.io.northwind.business.requests.categories.CreateCategoryRequest;
import com.kodlama.io.northwind.business.requests.categories.UpdateCategoryRequest;
import com.kodlama.io.northwind.business.responses.categories.CreateCategoryResponse;
import com.kodlama.io.northwind.business.responses.categories.DeleteCategoryResponse;
import com.kodlama.io.northwind.business.responses.categories.GetAllCategoriesResponse;
import com.kodlama.io.northwind.business.responses.categories.UpdateCategorytResponse;
import com.kodlama.io.northwind.dataAccess.abstracts.CategoryRepository;
import com.kodlama.io.northwind.entities.Category;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoryManager implements CategoryService{

	private CategoryRepository categoryRepository;  
	
	@Override
	public List<GetAllCategoriesResponse> getAll() {
		List<Category> categories = categoryRepository.findAll();
		List<GetAllCategoriesResponse> getAllCategoriesResponses =new ArrayList<GetAllCategoriesResponse>();
		
		for (Category category : categories) {
			GetAllCategoriesResponse response =new GetAllCategoriesResponse();
			response.setId(category.getId());
			response.setName(category.getName());
			getAllCategoriesResponses.add(response);
		}
		return getAllCategoriesResponses;
	}

	@Override
	public CreateCategoryResponse add (CreateCategoryRequest createCategoryRequest) {
		Category category= new Category();
		category.setName(createCategoryRequest.getName());
		
		categoryRepository.save(category);
		
		CreateCategoryResponse createCategoryResponse = new CreateCategoryResponse();
		createCategoryResponse.setName(category.getName());
		return createCategoryResponse;
	}

	@Override
	public UpdateCategorytResponse update(UpdateCategoryRequest updateCategoryRequest) {
		Category category = categoryRepository.findById(updateCategoryRequest.getId()).get();
		
		category.setId(updateCategoryRequest.getId());
		category.setName(updateCategoryRequest.getName());
		categoryRepository.save(category);
		
		UpdateCategorytResponse updateCategorytResponse = new UpdateCategorytResponse();
		updateCategorytResponse.setId(category.getId());
		updateCategorytResponse.setName(category.getName());
		return updateCategorytResponse;
	}

	@Override
	public DeleteCategoryResponse deleteById(int id) {
		Category category =categoryRepository.findById(id).get();
		categoryRepository.delete(category);
		
		DeleteCategoryResponse deleteCategoryResponse =new DeleteCategoryResponse();
		deleteCategoryResponse.setId(category.getId());
		deleteCategoryResponse.setName(category.getName());
		return deleteCategoryResponse;
		
	}
}
