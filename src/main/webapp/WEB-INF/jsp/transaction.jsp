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
        <th>Date</th>
        <th>Receipt Number</th>
    </tr>
    <c:forEach var = "listitem" items = "${transactionlist}">
        <tr>
            <td>${listitem.date}</td>
            <td>${listitem.receipt}</td>
            <td>
                <a href="/transactionEdit/${listitem.getId()}">Edit</a>
                <a href="/transactionDelete/${listitem.getId()}">Delete</a>
                <a href="/transactionView/${listitem.getId()}">View</a>
            </td>
        </tr>
    </c:forEach>
</table>



</body>
</html>