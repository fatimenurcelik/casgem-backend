package com.kodlamaio.bootcampProject.business.responses.instructors;

import com.kodlamaio.bootcampProject.business.responses.users.GetUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetInstructorResponse extends GetUserResponse{
	private int userId;
	private String companyName;
}
