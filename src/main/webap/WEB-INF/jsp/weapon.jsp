<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weapons</title>
</head>
<body>

<c:forEach items="${weapons}" var="weapon">
    ${weapon.id}<br>
    ${weapon.name}<br>
    ${weapon.category}<br>
</c:forEach>

</body>
</html>