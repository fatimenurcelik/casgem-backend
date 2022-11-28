package com.kodlamaio.bootcampProject.business.responses.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponse {
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
}
