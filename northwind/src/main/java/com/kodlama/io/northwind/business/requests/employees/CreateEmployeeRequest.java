package com.kodlama.io.northwind.business.requests.employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateEmployeeRequest {
	
	private String firstName;
	private String lastName;
	private int salary;

}
