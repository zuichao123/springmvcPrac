<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/course/add" method="post">
    课程编号：<input type="text" name="id"/><br/>
    课程名称：<input type="text" name="name"/><br/>
    课程价格：<input type="text" name="price"/><br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
