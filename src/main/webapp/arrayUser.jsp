<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="">
    <input type="text" class="input1">
    <input type="text" class="input2">
    <input type="text" class="input3">

    <input type="submit" id="submit"  value="上传"/>
    <script src="./js/jquery-1.8.3.min.js"></script>
    <script>

        $(function () {
            $("#submit").on("click", function () {
                var input1 = $(".input1").val();
                var input2 = $(".input2").val();
                var input3 = $(".input3").val();
                var array = [input1, input2, input3];
                $.ajax({
                    type : 'POST',
                    url: '/user/arrayUser',
                    contentType : "application/json" ,
                    data : JSON.stringify(array),
                    success : function(data) {
                        alert("ok");
                    }
                });
            })
        })
    </script>
</form>
</body>
</html>
