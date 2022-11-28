package com.kodlamaio.bootcampProject.business.responses.employees;

import com.kodlamaio.bootcampProject.business.responses.users.AddUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddEmployeeResponse extends AddUserResponse{
	private int userId;
	private String positon;
}
