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



<a href="/customer">Manage Customers</a>
<br>
<a href="/employee">Manage Employees</a>
<br>
<a href="/product">Manage Products</a>
<br>
<a href="/transaction">Manage Transaction</a>
</body>
</html>