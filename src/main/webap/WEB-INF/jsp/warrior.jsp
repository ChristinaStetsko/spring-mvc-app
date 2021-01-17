<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Warrior</title>
</head>
<body>

<%--@elvariable id="warrior" type=""--%>
<form:form method="POST" action="/warriors/add" modelAttribute="warrior">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Id</form:label></td>
            <td><form:input path="lastName"/></td>
        </tr>
        <
        <tr>
            <td><form:label path="weapon">Id</form:label></td>
            <td><form:input path="weapon"/></td>
        </tr>
        <tr>
            <td><form:label path="membership">Id</form:label></td>
            <td><form:input path="membership"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

<c:if test="${createdWarrior != null}">
    ${createdWarrior.name}<br>
    ${createdWarrior.lastName}
</c:if>

</body>
</html>