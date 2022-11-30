package com.kodlamaio.bootcampProject.business.requests.bootcamps;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBootcampsRequest {
	@NotNull(message = ValidationMessages.Bootcamp.InstructorIdBlank)
	private int instructorId;
	
	@NotBlank(message = ValidationMessages.Bootcamp.NameBlank)
	@Size(min=2 , max= 30, message= ValidationMessages.Bootcamp.NameValid)
	private String name;
	
	//@NotNull(message = ValidationMessages.Bootcamp.StartDateBlank)
	@JsonFormat(pattern="dd-MM-yyyy")
	private String dateStart;
	
	//@NotNull(message = ValidationMessages.Bootcamp.EndDateBlank)
	@JsonFormat(pattern="dd-MM-yyyy")
	private String dateEnd;
	
	@NotNull(message = ValidationMessages.Bootcamp.StateBlank )
	private int BootcampsStateId;
}
