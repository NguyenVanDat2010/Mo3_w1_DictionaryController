<%--
  Created by IntelliJ IDEA.
  User: VCOM
  Date: 04/07/2020
  Time: 2:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="dictionary">
    <h1>Vietnamese Dictionary</h1>
    <INPUT type="text" placeholder="Enter your word" name="word">
    <input type="submit" value="Submit">
</form>

<span>${result}</span>
</body>
</html>
