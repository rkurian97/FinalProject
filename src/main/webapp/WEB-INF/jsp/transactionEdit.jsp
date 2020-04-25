<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
</head>
<body>


<hr/>
<form method="post" action="/saveT">
    <input type="hidden" name="id" value="${selectedItem.getId()}">
    <br>Date: <br>
    <input type="text" name="date" value="${selectedItem.getDate()}">
    <br>Receipt:<br>
    <input type="text" name="receipt" value="${selectedItem.getReceipt()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>