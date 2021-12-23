package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.dao.EmployeeDAOImp;
import com.createiq.ems.model.Employee;

public class EmployeeServiceImp implements EmployeeService{
	
	EmployeeDAO employeeDAO = new EmployeeDAOImp();
	

	@Override
	public List<Employee> findAll() {

		return employeeDAO.findAll();
	}

	@Override
	public List<Employee> findByName(String ename) {

		return employeeDAO.findByName(ename);
	}



	@Override
	public void add(Employee employee) {
      
		 employeeDAO.add(employee);
	}

	@Override
	public void update(Employee employee) {

		employeeDAO.update(employee);
	}

	@Override
	public void delete(Integer eid) {

		employeeDAO.delete(eid);
	}

	@Override
	public Employee findById(Integer eid) {

		return employeeDAO.findById(eid);
	}

}
