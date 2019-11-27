<%--
  Created by IntelliJ IDEA.
  User: LW
  Date: 2019/11/11
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>index page</h1>
    <hr/>

    <form method="get" action="/list">
        <input type="text" name="emps[0].id"/>
        <input type="text" name="emps[0].username"/>
        <input type="text" name="emps[0].gender"/>

        <input type="text" name="emps[1].id"/>
        <input type="text" name="emps[1].username"/>
        <input type="text" name="emps[1].gender"/>

        <input type="submit" value="提交"/>
    </form>


<h1>绑定到数组</h1>

<form method="get" action="/array">

    <input type="text" name="name"/>
    <input type="text" name="name"/>
    <input type="text" name="name"/>

    <input type="submit" value="提交"/>
</form>



</body>
</html>
