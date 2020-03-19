<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %> <!-- 是否忽略解析el表达式 -->
<html>
<head>
    <style>
        #goods {
            width: 200px;
        }
    </style>
</head>
<body>
<form action="/goods/addGoods" method="post">
    <input type="text" name="goods" id="goods" placeholder="请输入商品：编号, 名称, 价格">(例如：1,鼠标,108.10)
    <input type="submit" value="提交">
</form>
</body>
</html>

