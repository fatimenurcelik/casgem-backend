package com.kodlama.io.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.northwind.business.abstracts.OrderService;
import com.kodlama.io.northwind.business.requests.orders.CreateOrderRequest;
import com.kodlama.io.northwind.business.responses.orders.GetAllOrdersResponse;
import com.kodlama.io.northwind.dataAccess.abstracts.EmployeeRepository;
import com.kodlama.io.northwind.dataAccess.abstracts.OrderRepository;
import com.kodlama.io.northwind.entities.Employee;
import com.kodlama.io.northwind.entities.Order;

@Service
public class OrderManager implements OrderService{

	private OrderRepository orderRepository;
	private EmployeeRepository employeeRepository;
	
	public OrderManager(OrderRepository orderRepository, EmployeeRepository employeeRepository) {
		super();
		this.orderRepository = orderRepository;
		this.employeeRepository =employeeRepository;
	}

	@Override
	public List<GetAllOrdersResponse> getAll() {
		List<Order> orders = orderRepository.findAll();
		List<GetAllOrdersResponse> getAllOrdersResponses = new ArrayList<GetAllOrdersResponse>();
		
		for (Order order: orders) {
			GetAllOrdersResponse responseItem = new GetAllOrdersResponse();
			responseItem.setId(order.getId());
			responseItem.setDate(order.getDate());
			responseItem.setFirstName(order.getEmployee().getFirstName());
			responseItem.setLastName(order.getEmployee().getLastName());
			responseItem.setSalary(order.getEmployee().getSalary());
			getAllOrdersResponses.add(responseItem);
		}
		return getAllOrdersResponses;
	}

	@Override
	public void add(CreateOrderRequest createOrderRequest) {
		Employee employee = employeeRepository.findById(createOrderRequest.getEmployeeId()).get();
		Order order= new Order();
		order.setDate(createOrderRequest.getDate());
		order.setEmployee(employee);
		orderRepository.save(order);
		
	}

}
