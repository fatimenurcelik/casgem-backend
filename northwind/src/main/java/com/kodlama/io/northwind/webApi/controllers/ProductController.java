package com.kodlama.io.northwind.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.northwind.business.abstracts.ProductService;
import com.kodlama.io.northwind.business.requests.products.CreateProductRequest;
import com.kodlama.io.northwind.business.responses.products.CreateProductResponse;
import com.kodlama.io.northwind.business.responses.products.DeleteProductResponse;
import com.kodlama.io.northwind.business.responses.products.GetAllProductsResponse;
import com.kodlama.io.northwind.business.responses.products.GetProductResponse;
import com.kodlama.io.northwind.business.responses.products.UpdateProductResponse;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<GetAllProductsResponse> getAllProductsResponse() {
		return productService.getAll();
	}

	@GetMapping("/getbyname")
	public List<GetAllProductsResponse> getByName(String name) {
		return productService.getByName(name);
	}

	@GetMapping("/getbyid")
	public GetProductResponse getById(int id) {
		return productService.getById(id);
	}
	@PostMapping("/add")
	public CreateProductResponse add(@RequestBody CreateProductRequest createProductRequest) {
		return productService.add(createProductRequest);
	}
	@DeleteMapping("/delete")
	public DeleteProductResponse deleteById(int id) {
		return productService.deleteById(id);
	}
	@PutMapping("/update")
	public UpdateProductResponse updateProductResponse(@RequestBody UpdateProductResponse updateProductResponse) {
		return productService.updateById(updateProductResponse);
	}
}
