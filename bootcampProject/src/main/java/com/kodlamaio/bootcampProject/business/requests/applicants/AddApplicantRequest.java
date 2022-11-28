package com.kodlamaio.bootcampProject.business.requests.applicants;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;
import com.kodlamaio.bootcampProject.business.requests.users.AddUserRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddApplicantRequest extends AddUserRequest{
//	@NotBlank(message = ValidationMessages.Applicant.BlackListId)
//	private int blackListId;
	
	@NotBlank(message = ValidationMessages.Applicant.AboutBlank)
	@Size(min=5, max=100, message = ValidationMessages.Applicant.AboutValid)
	private String about;
}
