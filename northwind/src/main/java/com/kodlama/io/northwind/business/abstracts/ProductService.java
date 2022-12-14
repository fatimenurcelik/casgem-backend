package com.kodlama.io.northwind.business.abstracts;

import java.util.List;

import com.kodlama.io.northwind.business.requests.products.CreateProductRequest;
import com.kodlama.io.northwind.business.responses.products.CreateProductResponse;
import com.kodlama.io.northwind.business.responses.products.DeleteProductResponse;
import com.kodlama.io.northwind.business.responses.products.GetAllProductsResponse;
import com.kodlama.io.northwind.business.responses.products.GetProductResponse;
import com.kodlama.io.northwind.business.responses.products.UpdateProductResponse;

public interface ProductService {
	List<GetAllProductsResponse> getAll();
	CreateProductResponse add(CreateProductRequest createProductRequest);
	List<GetAllProductsResponse> getByName(String name);
	GetProductResponse getById(int id);
	DeleteProductResponse deleteById(int id);
	UpdateProductResponse updateById(UpdateProductResponse updateProductResponse);
}
