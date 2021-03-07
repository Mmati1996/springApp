<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "todo.util.Mappings" %>
<html>

<head>
    <title>ToDo app</title>
</head>

<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show todo items</a></h2>
    </div>
</body>

</html>