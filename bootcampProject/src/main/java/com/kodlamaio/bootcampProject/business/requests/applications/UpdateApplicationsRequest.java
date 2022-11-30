package com.kodlamaio.bootcampProject.business.requests.applications;

import javax.validation.constraints.NotNull;

import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateApplicationsRequest {
	@NotNull(message= ValidationMessages.Application.IdBlank)
	private int id;
	
	@NotNull(message= ValidationMessages.Application.ApplicantIdBlank)
	private int applicantsId;
	
	@NotNull(message= ValidationMessages.Application.BootcampIdBlank)
	private int bootcampId;
	
	@NotNull(message = ValidationMessages.Application.StateBlank )
	private int applicationsStateId;
}
