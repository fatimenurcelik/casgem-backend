package com.kodlamaio.bootcampProject.business.responses.bootcamps;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBootcampsResponse {
	private int id;
	private int instructorId;
	private String name;
	private LocalDate dateStart;
	private LocalDate dateEnd;
	private int state;
}
