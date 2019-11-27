<%--
  Created by IntelliJ IDEA.
  User: LW
  Date: 2019/11/21
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/emp/insert">
        <input type="text" name="username"/>
        <input type="text" name="salary"/>
        <input type="text" name="hiredate"/>
        <input type="submit" name="添加"/>
    </form>
</body>
</html>
