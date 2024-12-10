<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Danh sach nhan vien</h1>
<br>
<a href="employee?action=add">Display Employee</a>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>name</th>
        <th>age</th>
        <th>jobPosition</th>
        <th>department</th>
        <th>salary</th>
        <th>action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${listEmployee}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.jobPosition}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>

            <td>
                <a href="employee?action=edit&id=${employee.id}">Edit</a>
                <a href="employee?action=delete&id=${employee.id}" >Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>