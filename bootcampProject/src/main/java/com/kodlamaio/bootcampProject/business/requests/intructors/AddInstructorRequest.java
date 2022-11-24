package com.kodlamaio.bootcampProject.business.requests.intructors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddInstructorRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String companyName;
}
