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
 * Servlet implementation class Update
 */
@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Update() {
        super();

    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer eid = Integer.parseInt(request.getParameter("eid"));
		EmployeeService employeeService = new EmployeeServiceImp();

		Employee employee = employeeService.findById(eid);
		request.setAttribute("employee", employee);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeService employeeService = new EmployeeServiceImp();

		Integer eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		Double esalary = Double.parseDouble(request.getParameter("esalary"));

		Employee employee = new Employee( eid, ename, esalary);
      
		employeeService.update(employee);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./findall");
		requestDispatcher.forward(request, response);

	}

}
