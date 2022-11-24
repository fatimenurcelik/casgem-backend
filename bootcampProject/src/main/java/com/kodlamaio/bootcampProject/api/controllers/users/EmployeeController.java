package com.kodlamaio.bootcampProject.api.controllers.users;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.bootcampProject.business.abstracts.EmployeeService;
import com.kodlamaio.bootcampProject.business.requests.employees.AddEmployeeRequest;
import com.kodlamaio.bootcampProject.business.requests.employees.UpdateEmployeeRequest;
import com.kodlamaio.bootcampProject.business.responses.employees.AddEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.GetAllEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.GetEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.UpdateEmployeeResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService employeeService;
	
	@GetMapping()
	public DataResult<List<GetAllEmployeeResponse>> getAll () {
		return this.employeeService.getAll();
	}
	
	@PostMapping()
	public DataResult<AddEmployeeResponse> add(@RequestBody AddEmployeeRequest addEmployeeRequest) {
		return this.employeeService.add(addEmployeeRequest);
	}
	
	@PutMapping()
	public DataResult <UpdateEmployeeResponse> update (@RequestBody UpdateEmployeeRequest updateEmployeeRequest){
		return this.employeeService.update(updateEmployeeRequest);
	}
	
	@DeleteMapping("/{id}")
	public Result delete (@PathVariable int id) {
		return this.employeeService.delete(id);
	}
	
	@GetMapping("/{id}")
	public DataResult<GetEmployeeResponse> getById(@PathVariable int id){
		return this.employeeService.getById(id);
	}
}
