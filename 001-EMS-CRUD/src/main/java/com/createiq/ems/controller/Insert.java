package com.createiq.ems.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;
import com.createiq.ems.service.EmployeeServiceImp;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Insert() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Integer eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		Double esalary = Double.parseDouble(request.getParameter("esalary"));
		
		EmployeeService employeeService = new EmployeeServiceImp();
		Employee employee = new Employee(ename, esalary);
		employeeService.add(employee);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/findall");
		requestDispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
