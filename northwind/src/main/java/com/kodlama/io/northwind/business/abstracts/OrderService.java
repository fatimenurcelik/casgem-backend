package com.kodlama.io.northwind.business.abstracts;

import java.util.List;

import com.kodlama.io.northwind.business.requests.orders.CreateOrderRequest;
import com.kodlama.io.northwind.business.requests.orders.UpdateOrderRequest;
import com.kodlama.io.northwind.business.responses.orders.DeleteOrderResponse;
import com.kodlama.io.northwind.business.responses.orders.GetAllOrdersResponse;
import com.kodlama.io.northwind.business.responses.orders.UpdateOrderResponse;

public interface OrderService {
	List <GetAllOrdersResponse> getAll();
	void add(CreateOrderRequest createOrderRequest);
	UpdateOrderResponse update(UpdateOrderRequest updateOrderRequest);
	DeleteOrderResponse delete (int id);
}
