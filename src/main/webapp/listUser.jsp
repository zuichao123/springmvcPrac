<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/listUser" method="post">
    <input type="text" name="users[0].id"/><br/>
    <input type="text" name="users[0].name"/><br/>
    <input type="text" name="users[1].id"/><br/>
    <input type="text" name="users[1].name"/><br/>
    <input type="text" name="users[2].id"/><br/>
    <input type="text" name="users[2].name"/><br/>
    <input type="submit"/>
</form>
</body>
</html>
