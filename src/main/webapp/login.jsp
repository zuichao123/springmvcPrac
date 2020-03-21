<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/person/login" method="post" modelAttribute="student">
        <form:input path="name"></form:input><form:errors path="name" /><br/>
        <form:input path="age"></form:input><form:errors path="age"/><br/>
        <input type="submit"/>
    </form:form>
</body>
</html>
