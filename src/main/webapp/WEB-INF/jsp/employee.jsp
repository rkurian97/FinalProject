<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title> Final Project</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Employee ID</th>
    </tr>
    <c:forEach var = "listitem" items = "${employeelist}">
        <tr>
            <td>${listitem.firstName}</td>
            <td>${listitem.lastName}</td>
            <td>${listitem.employeeID}</td>
            <td>
                <a href="/employeeEdit/${listitem.getId()}">Edit</a>
                <a href="/employeeDelete/${listitem.getId()}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>



</body>
</html>