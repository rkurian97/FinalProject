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
    </tr>
    <c:forEach var = "listitem" items = "${customerlist}">
        <tr>
            <td>${listitem.getFirstName()}</td>
            <td>${listitem.getLastName()}</td>
            <td>
                <a href="/customerEdit/${listitem.getId()}">Edit</a>
                <a href="/customerDelete/${listitem.getId()}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>



</body>
</html>