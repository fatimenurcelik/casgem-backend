package com.kodlama.io.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlama.io.northwind.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
