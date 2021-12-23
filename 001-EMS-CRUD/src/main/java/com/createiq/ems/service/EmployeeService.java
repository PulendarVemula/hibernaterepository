package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	List<Employee> findByName(String ename);
	Employee findById(Integer eid);
	void add(Employee employee);
	void update(Employee employee);
	void delete(Integer eid);
}
