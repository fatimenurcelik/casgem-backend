package com.kodlamaio.bootcampProject.business.responses.applicants;

import com.kodlamaio.bootcampProject.business.responses.users.GetUserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetApplicantResponse extends GetUserResponse{
	private int userId;
	private String about;
}
