package com.kodlamaio.bootcampProject.business.responses.instructors;

import com.kodlamaio.bootcampProject.business.responses.users.GetAllUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllInstructorResponse extends GetAllUserResponse{
	private int userId;	
	private String companyName;
}
