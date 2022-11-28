package com.kodlamaio.bootcampProject.business.responses.employees;

import com.kodlamaio.bootcampProject.business.responses.users.GetAllUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeeResponse extends GetAllUserResponse{
	private int userId;
	private String positon;
}
