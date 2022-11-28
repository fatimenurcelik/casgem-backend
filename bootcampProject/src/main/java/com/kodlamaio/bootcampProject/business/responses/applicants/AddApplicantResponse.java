package com.kodlamaio.bootcampProject.business.responses.applicants;

import com.kodlamaio.bootcampProject.business.responses.users.AddUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddApplicantResponse extends AddUserResponse{
	private int userId;
	private String about;
}
