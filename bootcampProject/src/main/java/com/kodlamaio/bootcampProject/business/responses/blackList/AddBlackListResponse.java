package com.kodlamaio.bootcampProject.business.responses.blackList;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddBlackListResponse {
	private int id;
	private int applicantId;
	private String reason;
	private LocalDate date;
}
