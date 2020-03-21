<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="img"/>
    <input type="submit" value="上传"/><br/><br/>

    <c:if test="${filePath!=null && filePath!=''}">
        上传成功
        <a href="/download?filePath=${filePath}">下载</a>
    </c:if>
</form>
</body>
</html>