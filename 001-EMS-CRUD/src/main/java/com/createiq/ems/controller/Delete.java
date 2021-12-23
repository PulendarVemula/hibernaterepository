package com.createiq.ems.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.service.EmployeeService;
import com.createiq.ems.service.EmployeeServiceImp;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Delete() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		Integer eid = Integer.parseInt(request.getParameter("eid"));
		
		EmployeeService employeeService = new EmployeeServiceImp();
		employeeService.delete(eid);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/findall");
		requestDispatcher.forward(request, response);
	
	}

}
