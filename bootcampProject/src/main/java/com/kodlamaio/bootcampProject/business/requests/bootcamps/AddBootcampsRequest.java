package com.kodlamaio.bootcampProject.business.requests.bootcamps;

import javax.validation.constraints.NotBlank;
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
	@NotBlank(message = ValidationMessages.Bootcamp.InstructorIdBlank)
	private int instructorId;
	
	@NotBlank(message = ValidationMessages.Bootcamp.NameBlank)
	@Size(min=2 , max= 30, message= ValidationMessages.Bootcamp.NameValid)
	private String name;
	
	@NotBlank(message = ValidationMessages.Bootcamp.StartDateBlank)
	@JsonFormat(pattern="dd-MM-yyyy")
	private String dateStart;
	
	@NotBlank(message = ValidationMessages.Bootcamp.EndDateBlank)
	@JsonFormat(pattern="dd-MM-yyyy")
	private String dateEnd;
	
	@NotBlank(message = ValidationMessages.Bootcamp.)
	private int state;
}
