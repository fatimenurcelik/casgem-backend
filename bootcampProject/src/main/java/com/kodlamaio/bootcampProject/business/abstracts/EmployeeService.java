package com.kodlamaio.bootcampProject.business.abstracts;

import java.util.List;

import com.kodlamaio.bootcampProject.business.requests.employees.AddEmployeeRequest;
import com.kodlamaio.bootcampProject.business.requests.employees.UpdateEmployeeRequest;
import com.kodlamaio.bootcampProject.business.responses.employees.AddEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.GetAllEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.GetEmployeeResponse;
import com.kodlamaio.bootcampProject.business.responses.employees.UpdateEmployeeResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

public interface EmployeeService {
	DataResult <AddEmployeeResponse> add(AddEmployeeRequest addEmployeeRequest);
	DataResult <UpdateEmployeeResponse> update (UpdateEmployeeRequest updateEmployeeRequest);
	Result delete (int id);
	DataResult<List<GetAllEmployeeResponse>> getAll ();
	DataResult<GetEmployeeResponse> getById(int id);
}
