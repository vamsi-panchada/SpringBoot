<%--
  Created by IntelliJ IDEA.
  User: vamsipanchada
  Date: 10/08/21
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alien home</title>
</head>
<body>
<p>-------------------------------------</p><br>
<form action="addAlien">
    <br><p>Adding an Alien</p><br>
    <body>id: </body>
    <input type="text" name="id"><br>
    <body>name: </body>
    <input type="text" name="name"><br>
    <body>tech: </body>
    <input type="text" name="tech"><br>
    <input type="submit" value="ADD Alien"><br>
</form>
<p>-------------------------------------</p><br>
<form action="getAlienById">
    <br><p>Search an Alien by Id</p><br>
    <body>id: </body>
    <input type="text" name="id"><br>
    <input type="submit" value="Search"><br>
</form>
<p>-------------------------------------</p><br>
<form action="getAlienByTech">
    <br><p>Search an Alien by Tech</p><br>
    <body>tech: </body>
    <input type="text" name="tech"><br>
    <input type="submit" value="Search"><br>
</form>
<p>-------------------------------------</p><br>
</body>
</html>