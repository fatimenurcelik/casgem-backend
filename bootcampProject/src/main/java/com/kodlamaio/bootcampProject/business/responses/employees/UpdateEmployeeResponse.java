package com.kodlamaio.bootcampProject.business.responses.employees;

import com.kodlamaio.bootcampProject.business.responses.users.UpdateUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeResponse extends UpdateUserResponse{
	private int userId;
	private String positon;
}
