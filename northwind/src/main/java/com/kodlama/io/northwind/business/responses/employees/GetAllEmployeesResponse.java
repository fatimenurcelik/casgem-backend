package com.kodlama.io.northwind.business.responses.employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllEmployeesResponse {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
}
