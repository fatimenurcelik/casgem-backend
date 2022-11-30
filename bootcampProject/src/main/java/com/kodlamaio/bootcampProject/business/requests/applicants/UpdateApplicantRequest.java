package com.kodlamaio.bootcampProject.business.requests.applicants;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;
import com.kodlamaio.bootcampProject.business.requests.users.UpdateUserRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateApplicantRequest extends UpdateUserRequest{
	@NotNull(message = ValidationMessages.Applicant.IdBlank)
	private int userId;
	
//	@NotBlank(message = ValidationMessages.Applicant.BlackListId)
//	private int blackListId;
	
	@NotBlank(message = ValidationMessages.Applicant.AboutBlank)
	@Size(min=5, max=100, message = ValidationMessages.Applicant.AboutValid)
	private String about;
}
