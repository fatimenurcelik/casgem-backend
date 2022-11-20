package com.kodlama.io.northwind.business.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductResponse {
	private int id;
	private String name;
	private int categoryId;
	private int unitsInStock;
	private double unitPrice;
}
