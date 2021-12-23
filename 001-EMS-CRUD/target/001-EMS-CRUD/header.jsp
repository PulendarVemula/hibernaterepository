<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>header part</title>
<link rel="stylesheet" href="css/headerstyle.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div>
<h1 style="color: orangered; font-style: inherit;">Welcome to Employee Management System</h1>
</div>
<nav>
<ul>
  <li><a href="#home"><b>Home</b></a></li>
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
</body>
</html>