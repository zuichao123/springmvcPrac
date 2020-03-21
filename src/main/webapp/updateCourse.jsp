<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/course/update" method="post">
    课程编号：<input type="text" value="${course.id}" name="id" readonly/><br/>
    课程名称：<input type="text" value="${course.name}" name="name"/><br/>
    课程价格：<input type="text" value="${course.price}" name="price"/><br/>
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
