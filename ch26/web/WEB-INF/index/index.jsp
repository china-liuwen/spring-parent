<%--
  Created by IntelliJ IDEA.
  User: LW
  Date: 2019/11/20
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

    ${msg}
<form action="index.jsp" method="post">
    用户名：<input type="text" name="username"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
