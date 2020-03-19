<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>

    </style>
</head>
<body>
<div class="box">123</div>
<!--原生js实现     jQuery函数-->
<script src="./js/jquery-1.8.3.min.js"></script>
<script>
    $(function(){
        var user = {
            "id":1,
            "name":"张三"
        };
        $.ajax({
            url:"/json",
            data:JSON.stringify(user),
            type:"POST",
            contentType:"application/json;charset=UTF-8",
            dataType:"text",
            success:function(data){
                alert(data);
            }
        });
    });
</script>

</body>
</html>