<%--
  Created by IntelliJ IDEA.
  User: LW
  Date: 2019/11/21
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Employee list</title>
</head>
<body>

<table>

    <tr>
        <th>id</th>
        <th>username</th>
        <th>salary</th>
        <th>hiredate</th>
    </tr>
    <c:forEach items="${list.list}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.username}</td>
            <td>${emp.salary}</td>
            <td>${emp.hiredate}</td>
        </tr>
    </c:forEach>


</table>

<ul>
    <li><a href="/emp/list?pageNum=1"> 首页</a></li>
    <li><a href="/emp/list?pageNum=${list.prePage}"> 上一页</a></li>
    <li><a href="/emp/list?pageNum=${list.nextPage}"> 下一页</a></li>
    <li><a href="/emp/list?pageNum=${list.pages}"> 尾页</a></li>
    <c:forEach items="${list.navigatepageNums}" var="p">
        <li><a href="/emp/list?pageNum=${p}"> ${p}</a></li>
    </c:forEach>
</ul>

</body>
</html>
