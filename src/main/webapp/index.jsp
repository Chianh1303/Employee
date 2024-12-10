
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.example.employeeemplement.Employee" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("1", "Nguyễn Chí Anh", 20, "Tổng giám đốc","Phòng giám đốc",99999.0));
    employees.add(new Employee("2", "Nguyễn Chí Khánh", 19, "Trưởng phòng vệ sinh","Cả công ty",1000.0));
    employees.add(new Employee("3", "Nguyễn Chí Sâm", 19, "Trưởng phòng bảo vệ","Bãi gửi xe và cả công ty","1000.0"));
    employees.add(new Employee("4", "Nguyễn Chí Trang", 19, "Nhân viên quèn","Đáy xã hội",999.0));

    request.setAttribute("employees", employees);
%>
<h1 style="text-align: center;">Quản lý nhân viên</h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>position</th>
        <th>departments</th>
        <th>salary</th>
    </tr>
    <c:forEach var="employees" items="${employees}"  >
        <tr>
            <td>${employees.id}</td>
            <td>${employees.name}</td>
            <td>${employees.age}</td>
            <td>${employees.position}</td>
            <td>${employees.departments}</td>
            <td>${employees.salary}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>