package com.kodlama.io.northwind.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.northwind.business.abstracts.EmployeeService;
import com.kodlama.io.northwind.business.requests.employees.CreateEmployeeRequest;
import com.kodlama.io.northwind.business.responses.employees.GetAllEmployeesResponse;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	private EmployeeService employeeService;

	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public List <GetAllEmployeesResponse> getAll(){
		return employeeService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
		employeeService.add(createEmployeeRequest);
	}
	
}
