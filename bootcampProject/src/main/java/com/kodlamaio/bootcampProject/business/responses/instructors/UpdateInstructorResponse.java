package com.kodlamaio.bootcampProject.business.responses.instructors;

import com.kodlamaio.bootcampProject.business.responses.users.UpdateUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInstructorResponse extends UpdateUserResponse{
	private int userId;
	private String companyName;
}
