package com.kodlamaio.bootcampProject.business.responses.instructors;

import com.kodlamaio.bootcampProject.business.responses.users.AddUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddInstructorResponse extends AddUserResponse{
	private int userId;
	private String companyName;
}
