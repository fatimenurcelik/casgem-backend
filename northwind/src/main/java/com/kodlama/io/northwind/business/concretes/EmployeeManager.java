package com.kodlama.io.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.northwind.business.abstracts.EmployeeService;
import com.kodlama.io.northwind.business.requests.employees.CreateEmployeeRequest;
import com.kodlama.io.northwind.business.responses.employees.GetAllEmployeesResponse;
import com.kodlama.io.northwind.dataAccess.abstracts.EmployeeRepository;
import com.kodlama.io.northwind.entities.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeManager(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<GetAllEmployeesResponse> getAll() {
		List<Employee> employees = employeeRepository.findAll();
		List<GetAllEmployeesResponse> getAllEmployeesResponses = new ArrayList<GetAllEmployeesResponse>();
		
		for (Employee employee : employees) {
			GetAllEmployeesResponse responseItem = new GetAllEmployeesResponse();
			responseItem.setId(employee.getId());
			responseItem.setFirstName(employee.getFirstName());
			responseItem.setLastName(employee.getLastName());
			responseItem.setSalary(employee.getSalary());
			getAllEmployeesResponses.add(responseItem);
		}
		return getAllEmployeesResponses;
	}

	@Override
	public void add(CreateEmployeeRequest createEmployeeRequest) {

		Employee employee = new Employee();
		employee.setFirstName(createEmployeeRequest.getFirstName());
		employee.setLastName(createEmployeeRequest.getLastName());
		employee.setSalary(createEmployeeRequest.getSalary());
		
		employeeRepository.save(employee);
	}

}
