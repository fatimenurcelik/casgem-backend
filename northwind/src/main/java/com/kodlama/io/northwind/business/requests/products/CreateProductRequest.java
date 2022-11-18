package com.kodlama.io.northwind.business.requests.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductRequest {
	private int categoryId;
	private int id;
	private String name;
	private double unitPrice;
	private int unitsInStock;
}
