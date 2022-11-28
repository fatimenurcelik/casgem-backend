package com.kodlamaio.bootcampProject.business.responses.applications;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddApplicationsResponse {
	private int id;
	private int applicantsId;
	private int bootcampId;
	private int state;
}
