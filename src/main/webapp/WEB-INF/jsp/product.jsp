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
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
    </tr>
    <c:forEach var = "listitem" items = "${productlist}">
        <tr>
            <td>${listitem.name}</td>
            <td>${listitem.price}</td>
            <td>${listitem.description}</td>
            <td>
                <a href="/productEdit/${listitem.getId()}">Edit</a>
                <a href="/productDelete/${listitem.getId()}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>



</body>
</html>