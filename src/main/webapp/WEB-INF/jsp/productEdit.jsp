<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
</head>
<body>


<hr/>
<form method="post" action="/saveP">
    <input type="hidden" name="id" value="${selectedItem.getId()}">
    <br>Name: <br>
    <input type="text" name="name" value="${selectedItem.getName()}">
    <br>Price:<br>
    <input type="text" name="price" value="${selectedItem.getPrice()}">
    <br>Description:<br>
    <input type="text" name="description" value="${selectedItem.getDescription()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>