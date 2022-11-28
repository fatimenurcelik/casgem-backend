package com.kodlamaio.bootcampProject.business.responses.applicants;

import com.kodlamaio.bootcampProject.business.responses.users.GetAllUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllApplicantResponse extends GetAllUserResponse{
	private int userId;
	private String about;
}
