package com.kodlama.io.northwind.business.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductResponse {
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitInStock;
}
