package com.kodlamaio.bootcampProject.business.responses.applicants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllApplicantResponse {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String about;
}
