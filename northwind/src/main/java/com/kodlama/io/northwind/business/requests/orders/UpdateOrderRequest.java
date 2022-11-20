package com.kodlama.io.northwind.business.requests.orders;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOrderRequest {
	
	private int id;
	private LocalDateTime date;
	private int employeeId;
	}
