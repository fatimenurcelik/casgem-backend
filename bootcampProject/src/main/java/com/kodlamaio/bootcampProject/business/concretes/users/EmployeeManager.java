package com.kodlamaio.bootcampProject.business.concretes.users;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kodlamaio.bootcampProject.business.abstracts.EmployeeService;
import com.kodlamaio.bootcampProject.business.constants.Messages;
import com.kodlamaio.bootcampProject.business.requests.employees.AddEmployeeRequest;
import com.kodlamaio.bootcampProject.business.requests.employees.UpdateEmployeeRequest;
import com.kodlamaio.bootcampProject.business.responses.employees.AddEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.GetAllEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.GetEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.UpdateEmployeeResponse;
import com.kodlamaio.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessDataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.SuccessResult;
import com.kodlamaio.bootcampProject.dataAccess.abstracts.EmployeeRepository;
import com.kodlamaio.bootcampProject.entities.users.Employee;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeRepository employeeRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public DataResult<AddEmployeeResponse> add(AddEmployeeRequest addEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(addEmployeeRequest, Employee.class);
		employeeRepository.save(employee);
		AddEmployeeResponse addEmployeeResponse = this.modelMapperService.forResponse().map(employee, AddEmployeeResponse.class);
		return new SuccessDataResult<AddEmployeeResponse>(addEmployeeResponse, Messages.EmployeeCreated);
	}

	@Override
	public DataResult<UpdateEmployeeResponse> update(UpdateEmployeeRequest updateEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(updateEmployeeRequest, Employee.class);
		employeeRepository.save(employee);
		UpdateEmployeeResponse updateEmployeeResponse = this.modelMapperService.forResponse().map(employee, UpdateEmployeeResponse.class);
		return new SuccessDataResult<UpdateEmployeeResponse>(updateEmployeeResponse,Messages.EmployeeUpdated);
	}

	@Override
	public Result delete(int id) {
		this.employeeRepository.deleteById(id);
		return new SuccessResult(Messages.EmployeeDeleted);
	}

	@Override
	public DataResult<List<GetAllEmployeeResponse>> getAll() {
		List<Employee> employees = employeeRepository.findAll();
		List<GetAllEmployeeResponse> getAllEmployeeResponses = employees.stream()
				.map(employee -> this.modelMapperService.forResponse()
						.map(employee,GetAllEmployeeResponse.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllEmployeeResponse>>(getAllEmployeeResponses);
	}

	@Override
	public DataResult<GetEmployeeResponse> getById(int id) {
		Employee employee = this.employeeRepository.findById(id).get();
		GetEmployeeResponse getEmployeeResponse = this.modelMapperService.forResponse().map(employee, GetEmployeeResponse.class);
		return new SuccessDataResult<GetEmployeeResponse>(getEmployeeResponse);
	}
}
