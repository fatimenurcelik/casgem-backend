package com.kodlama.io.northwind.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kodlama.io.northwind.business.abstracts.OrderService;
import com.kodlama.io.northwind.business.requests.orders.CreateOrderRequest;
import com.kodlama.io.northwind.business.responses.orders.GetAllOrdersResponse;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	private OrderService orderService;

	public OrdersController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping("/getall")
	public List <GetAllOrdersResponse> getAll(){
		return orderService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateOrderRequest createOrderRequest) {
		orderService.add(createOrderRequest);
	}
}
