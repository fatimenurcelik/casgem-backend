package com.kodlamaio.bootcampProject.business.responses.bootcamps;

import java.time.LocalDate;

import com.kodlamaio.bootcampProject.entities.applications.BootcampsState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBootcampsResponse {
	private int id;
	private int instructorId;
	private String name;
	private LocalDate dateStart;
	private LocalDate dateEnd;
	private int bootcampsStateId;
}
