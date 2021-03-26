<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
    <body>
    <h2>注册</h2>
    <form action="/register" method="post">
        姓名:<input type="text" name="name">
        密码:<input type="password" name="password">
        <input type="submit" name="注册">
    </form>
    <br>
    <a href="/login">登录</a>
    </body>
</html>
