<%--
  Created by IntelliJ IDEA.
  User: LW
  Date: 2019/11/20
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="/upload">
    <input type="file" name="myfile"/>
    <input type="submit" name="提交"/>
</form>
</body>
</html>
