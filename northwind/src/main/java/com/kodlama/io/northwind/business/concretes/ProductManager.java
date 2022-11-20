package com.kodlama.io.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.northwind.business.abstracts.ProductService;
import com.kodlama.io.northwind.business.requests.products.CreateProductRequest;
import com.kodlama.io.northwind.business.responses.products.CreateProductResponse;
import com.kodlama.io.northwind.business.responses.products.DeleteProductResponse;
import com.kodlama.io.northwind.business.responses.products.GetAllProductsResponse;
import com.kodlama.io.northwind.business.responses.products.GetProductResponse;
import com.kodlama.io.northwind.business.responses.products.UpdateProductResponse;
import com.kodlama.io.northwind.dataAccess.abstracts.ProductRepository;
import com.kodlama.io.northwind.entities.Category;
import com.kodlama.io.northwind.entities.Product;

@Service
public class ProductManager implements ProductService{

	private ProductRepository productRepository;
	
	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<GetAllProductsResponse> getAll() {
		List<Product> products = this.productRepository.findAll();
		List<GetAllProductsResponse> getAllProductsResponses= new ArrayList<GetAllProductsResponse>();
		
		for (Product product : products) {
			GetAllProductsResponse response = new GetAllProductsResponse();
			response.setCategoryName(product.getCategory().getName());
			response.setName(product.getName());
			response.setId(product.getId());
			response.setUnitPrice(product.getUnitPrice());
			response.setUnitsInStock(product.getUnitsInStock());
			getAllProductsResponses.add(response);
		}
		return getAllProductsResponses;
	}

	@Override
	public CreateProductResponse add(CreateProductRequest createProductRequest) {
		Product product = new Product();
		product.setName(createProductRequest.getName());
		product.setUnitsInStock(createProductRequest.getUnitsInStock());
		product.setUnitPrice(createProductRequest.getUnitPrice());
		
		Category category= new Category();
		category.setId(createProductRequest.getCategoryId());
		
		product.setCategory(category);
		
		this.productRepository.save(product);
	
		CreateProductResponse createProductResponse = new CreateProductResponse();
		createProductResponse.setCategoryId(product.getCategory().getId());
		createProductResponse.setName(product.getName());
		createProductResponse.setUnitPrice(product.getUnitPrice());
		createProductResponse.setUnitInStock(product.getUnitsInStock());
		
		return createProductResponse;
	}

	@Override
	public List<GetAllProductsResponse> getByName(String name) {
		List<Product> products = productRepository.findByName(name);
		List<GetAllProductsResponse>getAllProductsResponses = new ArrayList<GetAllProductsResponse>();
		for (Product product: products) {
			GetAllProductsResponse response = new GetAllProductsResponse();
			response.setId(product.getId());
			response.setName(product.getName());
			response.setUnitPrice(product.getUnitPrice());
			response.setUnitsInStock(product.getUnitsInStock());
			response.setCategoryName(product.getCategory().getName());
			getAllProductsResponses.add(response);
		}
		return getAllProductsResponses;
	}

	@Override
	public GetProductResponse getById(int id) {
		Product product =productRepository.findById(id).get();
		GetProductResponse productResponse = new GetProductResponse();
		productResponse.setId(product.getId());
		productResponse.setName(product.getName());
		productResponse.setCategoryName(product.getCategory().getName());
		productResponse.setUnitPrice(product.getUnitPrice());
		productResponse.setUnitsInStock(product.getUnitsInStock());
		return productResponse;
	}

	@Override
	public DeleteProductResponse deleteById(int id) {
		Product product = productRepository.findById(id).get();
		productRepository.delete(product);
		
		DeleteProductResponse deleteProductResponse =new DeleteProductResponse();
		deleteProductResponse.setId(product.getId());
		deleteProductResponse.setCategoryName(product.getCategory().getName());
		deleteProductResponse.setName(product.getName());
		deleteProductResponse.setUnitPrice(product.getUnitPrice());
		deleteProductResponse.setUnitsInStock(product.getUnitsInStock());
		 return deleteProductResponse;
	}

	@Override
	public UpdateProductResponse updateById(UpdateProductResponse updateProductResponse) {
		
		Product product = productRepository.findById(updateProductResponse.getId()).get();
		Category category= new Category();
		category.setId(updateProductResponse.getCategoryId());
		
		product.setCategory(category);
		
		product.setId(updateProductResponse.getId());
		product.setName(updateProductResponse.getName());
		product.setUnitPrice(updateProductResponse.getUnitPrice());
		product.setUnitsInStock(updateProductResponse.getUnitsInStock());
		product.setCategory(category);
		
		this.productRepository.save(product);
		
		updateProductResponse.setCategoryId(product.getCategory().getId());
		updateProductResponse.setName(product.getName());
		updateProductResponse.setUnitPrice(product.getUnitPrice());
		updateProductResponse.setUnitsInStock(product.getUnitsInStock());
		updateProductResponse.setId(product.getId());
		
		return updateProductResponse;
	}


}
