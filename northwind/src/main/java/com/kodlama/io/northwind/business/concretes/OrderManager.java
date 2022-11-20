package com.kodlama.io.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlama.io.northwind.business.abstracts.OrderService;
import com.kodlama.io.northwind.business.requests.orders.CreateOrderRequest;
import com.kodlama.io.northwind.business.requests.orders.UpdateOrderRequest;
import com.kodlama.io.northwind.business.responses.orders.DeleteOrderResponse;
import com.kodlama.io.northwind.business.responses.orders.GetAllOrdersResponse;
import com.kodlama.io.northwind.business.responses.orders.UpdateOrderResponse;
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

	@Override
	public UpdateOrderResponse update(UpdateOrderRequest updateOrderRequest) {
		Employee employee  =new Employee();
		employee.setId(updateOrderRequest.getEmployeeId());
		Order order = new Order();
		order.setId(updateOrderRequest.getId());
		order.setDate(updateOrderRequest.getDate());
		order.setEmployee(employee);
		
		orderRepository.save(order);
		
		UpdateOrderResponse updateOrderResponse = new UpdateOrderResponse();
		updateOrderResponse.setId(order.getId());
		updateOrderResponse.setDate(order.getDate());
		updateOrderResponse.setEmployeeId(order.getEmployee().getId());
		
		return updateOrderResponse;
	}

	@Override
	public DeleteOrderResponse delete(int id) {
		Order order= orderRepository.findById(id).get();
		orderRepository.delete(order);
		
		DeleteOrderResponse deleteOrderResponse = new DeleteOrderResponse();
		deleteOrderResponse.setId(order.getId());
		deleteOrderResponse.setDate(order.getDate());
		
		Employee employee =new Employee();
		employee.setId(order.getEmployee().getId());
		
		deleteOrderResponse.setEmployeeId(employee.getId());
		
		return deleteOrderResponse;
	}

}
