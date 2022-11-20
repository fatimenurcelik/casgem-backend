package com.kodlama.io.northwind.business.abstracts;

import java.util.List;

import com.kodlama.io.northwind.business.requests.employees.CreateEmployeeRequest;
import com.kodlama.io.northwind.business.requests.products.UpdateEmployeeRequest;
import com.kodlama.io.northwind.business.responses.employees.DeleteEmployeeResponse;
import com.kodlama.io.northwind.business.responses.employees.GetAllEmployeesResponse;
import com.kodlama.io.northwind.business.responses.employees.UpdateEmployeeResponse;

public interface EmployeeService {
	List <GetAllEmployeesResponse> getAll();
	void add(CreateEmployeeRequest createEmployeeRequest );
	DeleteEmployeeResponse deleteById(int id);
	UpdateEmployeeResponse update(UpdateEmployeeRequest updateEmployeeRequest);
}
