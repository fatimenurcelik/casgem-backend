package com.kodlamaio.bootcampProject.business.requests.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kodlamaio.bootcampProject.business.constants.Regexes;
import com.kodlamaio.bootcampProject.business.constants.ValidationMessages;

public class UpdateUserRequest {
	@NotBlank(message= ValidationMessages.User.FirstNameBlank)
	@Size(min=3, max=25,message = ValidationMessages.User.FirstNameValid)
	private String firstName;
	
	@NotBlank(message = ValidationMessages.User.LastNameBlank)
	@Size(min=3, max=25, message = ValidationMessages.User.LastNameValid)
	private String lastName;
	
	@NotBlank(message = ValidationMessages.User.EmailBlank)
	@Email(regexp= Regexes.Email, message = ValidationMessages.User.EmailValid)
	private String email;
	
	@NotBlank(message = ValidationMessages.User.PasswordBlank)
	@Pattern(regexp= Regexes.Password, message = ValidationMessages.User.PasswordValid)
	private String password;
	
	@NotBlank(message = ValidationMessages.User.DateOfBirthBlank)
	@JsonFormat(pattern="dd-MM-yyyy")
	private String dateOfBirth;
	
	@NotBlank(message = ValidationMessages.User.NationalIdentityBlank)
	@Size(min=11, max=11, message = ValidationMessages.User.NationalIdentityValid)
	private String identityNo;
}
