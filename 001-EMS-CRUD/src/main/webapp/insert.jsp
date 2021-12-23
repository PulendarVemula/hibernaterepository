<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Employee</title>
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
<h2>New Employee Registration</h2>
</div>
<div class="formStyle">
<form action="./insert">
   <!--  <label for="eid">Employee id :</label>
    <input type="text" id="eid" name="eid" placeholder="Enter Employee id..."> -->

    <label for="ename">Employee Name :</label>
    <input type="text" id="ename" name="ename" placeholder="Enter Employee name...">

     <label for="esalary">Employee Salary :</label>
    <input type="text" id="esalary" name="esalary" placeholder="Enter Employee Salary..."> 
  
    <input type="submit" value="Submit">
  </form>
</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>