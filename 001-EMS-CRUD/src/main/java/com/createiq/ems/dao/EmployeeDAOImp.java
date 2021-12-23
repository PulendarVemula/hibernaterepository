package com.createiq.ems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.createiq.ems.model.Employee;
import com.createiq.ems.util.SessionUtil;

public class EmployeeDAOImp implements EmployeeDAO{

	@Override
	public List<Employee> findAll() {

Query<Employee> query = SessionUtil.getSession().createQuery("from Employee");
		
		
		return query.list();
	}

	@Override
	public List<Employee> findByName(String ename) {

		Query<Employee> query = SessionUtil.getSession().createQuery("from Employee");
		
		
		return query.list();
	}

	@Override
	public Employee findById(Integer eid) {
		
		Session session = SessionUtil.getSession();
		Employee employee = session.get(Employee.class	, eid);
		
		return employee;
	}

	@Override
	public void add(Employee employee) {
  
		Session session = SessionUtil.getSession();
		session.save(employee);
		session.beginTransaction().commit();
		SessionUtil.close(session);
		
	}

	@Override
	public void update(Employee employee) {
 
		Session session = SessionUtil.getSession();
		session.update(employee);
		session.beginTransaction().commit();
		SessionUtil.close(session);
		
	}

	@Override
	public void delete(Integer eid) {

		Session session = SessionUtil.getSession();
		Employee employee = new Employee();
		employee.setEid(eid);
		session.delete(employee);
		session.beginTransaction().commit();
		session.close();
		
	}

}
