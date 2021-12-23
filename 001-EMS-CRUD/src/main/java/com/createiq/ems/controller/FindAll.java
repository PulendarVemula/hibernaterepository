package com.createiq.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;
import com.createiq.ems.service.EmployeeServiceImp;

/**
 * Servlet implementation class FindAll
 */
@WebServlet("/findall")
public class FindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FindAll() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
		EmployeeService employeeService = new EmployeeServiceImp();
		List<Employee> employees = employeeService.findAll();
		request.setAttribute("employees", employees);
		
		request.getRequestDispatcher("findall.jsp").forward(request, response);
		
	}
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}
}
