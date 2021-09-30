<%--
  Created by IntelliJ IDEA.
  User: david.sapo
  Date: 30.09.2021
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Send e-mail to someone@example.com:</h2>

<form action="mailto:someone@example.com" method="post" enctype="text/plain">
    Name:<br>
    <input type="text" name="name"><br>
    E-mail:<br>
    <input type="text" name="mail"><br>
    Comment:<br>
    <input type="text" name="comment" size="50"><br><br>
    <input type="submit" value="Send">
    <input type="reset" value="Reset">
</form>

</body>
</html>
