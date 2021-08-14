<%--
  Created by IntelliJ IDEA.
  User: vamsipanchada
  Date: 13/08/21
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Login</title>
</head>
<body>

<p>Welcome to Student Login portal</p><br>
<br><p>${Error_text}</p><br>
<form action="/student_validate">
    <p>username: </p>
    <input type="text" name="Username"><br>
    <p>password: </p>
    <input type="text" name="password"><br>
    <input type="submit" value="Login"><br>
</form><br>

<form action="/">
    <input type="submit" value="back/home"><br>
</form>

</body>
</html>
