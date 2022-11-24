package com.kodlamaio.bootcampProject.business.requests.applicants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddApplicantRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String about;
}
