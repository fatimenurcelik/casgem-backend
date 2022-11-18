package com.kodlama.io.northwind.business.responses.orders;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllOrdersResponse {
	private int id;
	private LocalDateTime date;
	private String firstName;
	private String lastName;
	private int salary;
}
