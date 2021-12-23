<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all employees</title>
<link rel="stylesheet" href="css/headerstyle.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body style="background-color: lightcyan;">
<div>
<h1 style="color: orangered; font-style: inherit;">Welcome to Employee Management System</h1>
</div>
<nav>
<ul>
  <li><a href="welcome.jsp"><b>Home</b></a></li>
  <li><a href="#news"><b>News</b></a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn"><b>Employees</b></a>
    <div class="dropdown-content">
      <a href="./findall">All Employees</a>
      <a href="./insert.jsp">Add Employee</a>
    </div>
  </li>
</ul>
</nav>
<div class="formHeader">
<h2>All Employees</h2>
</div>

<span>
<%
request.getAttribute("employees");
request.getAttribute("employee");
%>
</span>
<span>
<%
request.getAttribute("message");
%>
</span>
<div class="tablediv">
<table id="employees">
  <tr>
    <th>Employee id</th>
    <th>Employee Name</th>
    <th>Employee Salary</th>
    <th>Employee Update</th>
    <th>Employee Delete</th>
    
  </tr>
  <c:forEach items="${employees}" var="employee">
<tr>
<td><c:out value="${employee.eid}"></c:out></td>
<td><c:out value="${employee.ename}"></c:out></td>
<td><c:out value="${employee.esalary}"></c:out></td>
<td><a href="./update?eid=${employee.eid}"><img src="icons/update.jpg" alt="update" style="width: 40px;height: 25px"></a></td>
<td><a href="./delete?eid=${employee.eid}"><img src="icons/delete.jpg" alt="delete" style="width: 30px;height: 20px"></a></td>
</tr>
</c:forEach>
</table>
</div>

</body>
</html>