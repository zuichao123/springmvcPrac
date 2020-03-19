<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/user/add" method="post">
    ID:<input type="text" name="id"/><br/>
    姓名:<input type="text" name="name"/><br/>
    年龄:<input type="text" name="age"/><br/>
    地址ID:<input type="text" name="address.id"/><br/>
    地址名:<input type="text" name="address.name"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
