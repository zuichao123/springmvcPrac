<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改用户信息</h1>
<form>
    用户编号：<input type="text" name="id" value="${person.id}"/><br/>
    用户姓名：<input type="text" name="name" value="${person.name}"/><br/>
    用户年龄：<input type="text" name="age" value="${person.age}"/><br/>
    用户性别：<input type="text" name="gender" value="${person.gender}"/><br/>
    地址编号：<input type="text" name="address.id" value="${person.address.id}"/><br/>
    地址名称：<input type="text" name="address.name" value="${person.address.name}"/><br/>
</form>
<hr/>
<form:form modelAttribute="person">
    用户编号：<form:input path="id"></form:input>
    用户姓名：<form:input path="name"></form:input>
    用户年龄：<form:input path="age"></form:input>
    用户性别：<form:input path="gender"></form:input><br/>
    地址编号：<form:input path="address.id"></form:input>
    地址名称：<form:input path="address.name"></form:input><br/>
    用户密码：<form:password path="password"></form:password><br/>
    checkbox:<form:checkbox path="flag"/><br/>
    用户爱好：<form:checkbox path="hobby" value="读书"></form:checkbox>读书
    <form:checkbox path="hobby" value="看电影"></form:checkbox>看电影
    <form:checkbox path="hobby" value="打游戏"></form:checkbox>打游戏
    <form:checkbox path="hobby" value="听音乐"></form:checkbox>听音乐
    <form:checkbox path="hobby" value="旅行"></form:checkbox>旅行
    <hr/>
    用户爱好：<form:checkbox path="hobby2" value="读书"></form:checkbox>读书
    <form:checkbox path="hobby2" value="看电影"></form:checkbox>看电影
    <form:checkbox path="hobby2" value="打游戏"></form:checkbox>打游戏
    <form:checkbox path="hobby2" value="听音乐"></form:checkbox>听音乐
    <form:checkbox path="hobby2" value="旅行"></form:checkbox>旅行
    <hr/>
    用户爱好：<form:checkboxes path="selectHobbys" items="${person.hobbys}"></form:checkboxes>
    <hr/>
    用户爱好：<form:checkboxes path="selectHobbys2" items="${person.hobbys2}"></form:checkboxes><br/>
    radio:<form:radiobutton path="radioId" value="0"></form:radiobutton>0
    <form:radiobutton path="radioId" value="1"></form:radiobutton>1
    <br/>
    radiobuttons:<form:radiobuttons path="selectGrade" items="${person.gradeMap}"></form:radiobuttons><br/>
    select:<form:select path="selectCity" items="${person.cityMap}"></form:select><br/>
    select&options:
    <form:select path="selectCity">
        <form:options items="${person.cityMap}"></form:options>
    </form:select>
    select&option:
    <form:select path="selectCity">
        <form:option value="3">杭州</form:option>
        <form:option value="4">成都</form:option>
        <form:option value="5">西安</form:option>
    </form:select><br/>
    <form:textarea path="introduce"/>
</form:form><br/>

</body>
</html>
