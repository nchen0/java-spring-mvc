<%--
  Created by IntelliJ IDEA.
  User: nchen
  Date: 2019-07-16
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName" />
    <br><br>
    Last name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error" />
    <br><br>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>