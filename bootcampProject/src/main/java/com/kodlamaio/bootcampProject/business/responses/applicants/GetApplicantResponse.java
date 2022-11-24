package com.kodlamaio.bootcampProject.business.responses.applicants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetApplicantResponse {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String about;
}
