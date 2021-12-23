package com.createiq.ems.dao;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
	List<Employee> findByName(String ename);
	Employee findById(Integer eid);
	
	void add(Employee employee);
	void update(Employee employee);
	void delete(Integer eid);
}
