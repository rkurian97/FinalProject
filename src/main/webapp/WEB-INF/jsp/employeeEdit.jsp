<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
</head>
<body>


<hr/>
<form method="post" action="/saveE">
    <input type="hidden" name="id" value="${selectedItem.getId()}">
    <br>First Name: <br>
    <input type="text" name="firstname" value="${selectedItem.getFirstName()}">
    <br>Last name:<br>
    <input type="text" name="lastname" value="${selectedItem.getLastName()}">
    <br>Employee ID:<br>
    <input type="text" name="employeeID" value="${selectedItem.getEmployeeID()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>