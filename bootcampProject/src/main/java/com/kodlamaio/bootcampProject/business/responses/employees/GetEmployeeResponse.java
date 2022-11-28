package com.kodlamaio.bootcampProject.business.responses.employees;

import com.kodlamaio.bootcampProject.business.responses.users.GetUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponse extends GetUserResponse{
	private int userId;
	private String positon;
}
