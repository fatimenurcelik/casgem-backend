package com.kodlama.io.northwind.business.requests.orders;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateOrderRequest {
	private int employeeId;
	private LocalDateTime date;
}
