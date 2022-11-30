package com.kodlamaio.bootcampProject.business.responses.applications;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateApplicationsResponse {
	private int id;
	private int applicantsId;
	private int bootcampId;
	private int applicationsStateId;
}
