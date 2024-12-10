<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
<h1>Add New Employee</h1>

<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>

<form action="employee?action=add" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required><br><br>

    <label for="jobPosition">Job Position:</label>
    <input type="text" id="jobPosition" name="jobPosition" required><br><br>

    <label for="department">Department:</label>
    <input type="text" id="department" name="department" required><br><br>

    <label for="salary">Salary:</label>
    <input type="number" id="salary" name="salary" required><br><br>

    <input type="submit" value="Add Employee">
</form>
</body>
</html>
