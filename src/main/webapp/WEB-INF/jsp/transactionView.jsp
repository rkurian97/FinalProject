<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>

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
        <th>Receipt</th>
        <td>${selectedItem.getReceipt()}</td>
    </tr>
    <tr>
        <th>Date</th>
        <td>${selectedItem.getDate()}</td>
    </tr>
    <tr>
        <th>Customer Name</th>
        <td>${selectedItem2.getFirstName()}</td>
    </tr>
</table>


</body>
</html>