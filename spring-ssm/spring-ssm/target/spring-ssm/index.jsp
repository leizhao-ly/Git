<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript">
        function test() {
            var xhr =new XMLHttpRequest();
            xhr.open("post","/test",true);
            //想要发送json的数据的时候需要配置这一项
            xhr.setRequestHeader("Content-type","application/json;charset=utf-8")
            //3.发送后时刻监听服务器的状态  回调机制
            xhr.onreadystatechange=function () {
                if(xhr.readyState==4&& xhr.status==200){
                    alert(xhr.responseText);
                }
            }
            //4.发送请求
            xhr.send('{"name":"晴儿二","sex":"女","age":"15"}');
        }
    </script>
</head>
<body>
    <form action="/register" method="post">
        姓名:<input type="text" name="name">
        <br>
        密码：<input type="password" name="password">
        <input type="submit" name="提交">
    </form>
</body>
</html>
