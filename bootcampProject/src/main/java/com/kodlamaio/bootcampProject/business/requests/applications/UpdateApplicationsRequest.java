package com.kodlamaio.bootcampProject.business.requests.applications;

import javax.validation.constraints.NotBlank;

import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateApplicationsRequest {
	@NotBlank(message= ValidationMessages.Application.IdBlank)
	private int id;
	
	@NotBlank(message= ValidationMessages.Application.ApplicantIdBlank)
	private int applicantsId;
	
	@NotBlank(message= ValidationMessages.Application.BootcampIdBlank)
	private int bootcampId;
	
	@NotBlank(message= ValidationMessages.Applicant.)
	private int state;
}
