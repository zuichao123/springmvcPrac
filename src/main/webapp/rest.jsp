<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %> <!-- 是否忽略解析el表达式 -->
<html>
<body>
<form action="/rest/put" method="POST">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT">
</form>
<hr>
<form action="/rest/delete" method="POST">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE">
</form>
<hr>
<form action="/rest/get/1" method="GET">
    <input type="submit" value="GET">
</form>
<hr>
<form action="/rest/post" method="POST">
    <input type="submit" value="POST">
</form>
</body>
</html>

