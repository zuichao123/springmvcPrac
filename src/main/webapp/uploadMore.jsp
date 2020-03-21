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
<form action="/uploadMore" method="post" enctype="multipart/form-data">
    file1:<input type="file" name="imgs"/>
    file2:<input type="file" name="imgs"/>
    file3:<input type="file" name="imgs"/>
    <input type="submit" value="上传"/><br/>
    <c:if test="${filePath!=null || filePath!=''}">
        <h1>上传的图片</h1>
        <c:forEach items="${filePaths}" var="img">
            <img src="${img}" style="width: 300px;">
        </c:forEach>
    </c:if>
</form>
</body>
</html>