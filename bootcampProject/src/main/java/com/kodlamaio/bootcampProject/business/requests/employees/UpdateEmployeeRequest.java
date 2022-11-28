package com.kodlamaio.bootcampProject.business.requests.employees;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;
import com.kodlamaio.bootcampProject.business.requests.users.UpdateUserRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest extends UpdateUserRequest{
	@NotBlank(message = ValidationMessages.User.IdBlank)
	private int userId;
	
	@NotBlank(message =ValidationMessages.Employee.PositionBlank)
	@Size(min=2, max=25, message=ValidationMessages.Employee.PositionValid)
	private String positon;
}
