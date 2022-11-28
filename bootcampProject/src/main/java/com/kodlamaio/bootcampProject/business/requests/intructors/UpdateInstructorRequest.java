package com.kodlamaio.bootcampProject.business.requests.intructors;

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
public class UpdateInstructorRequest extends UpdateUserRequest{
	@NotBlank(message = ValidationMessages.User.IdBlank)
	private int userId;
	
	@NotBlank(message = ValidationMessages.Instructor.CompanyBlank)
	@Size(min=2, max=50, message= ValidationMessages.Instructor.CompanyValid)
	private String companyName;
}
