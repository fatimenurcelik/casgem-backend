package com.kodlamaio.bootcampProject.business.responses.applicants;

import com.kodlamaio.bootcampProject.business.responses.users.UpdateUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateApplicantResponse extends UpdateUserResponse{
	private int userId;
	private String about;
}
