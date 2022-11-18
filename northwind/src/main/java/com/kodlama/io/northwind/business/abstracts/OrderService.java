package com.kodlama.io.northwind.business.abstracts;

import java.util.List;

import com.kodlama.io.northwind.business.requests.orders.CreateOrderRequest;
import com.kodlama.io.northwind.business.responses.orders.GetAllOrdersResponse;

public interface OrderService {
	List <GetAllOrdersResponse> getAll();
	void add(CreateOrderRequest createOrderRequest);
}
