<%--
  Created by IntelliJ IDEA.
  User: vamsipanchada
  Date: 10/08/21
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result for Alien for ${tech}</title>
</head>
<body>
<body>Result for tech: ${tech}</body><br>
<p>-------------------------------------</p><br>
<c:forEach var="alien" items="${result}">
    <body>ID: ${alien.id}</body><br>
    <body>Name: ${alien.name}</body><br>
    <body>Tech: ${alien.tech}</body><br>
    <p>-------------------------------------</p><br>
</c:forEach>
<form action="/">
    <input type="submit" value="home">
</form>
</body>
</html>
