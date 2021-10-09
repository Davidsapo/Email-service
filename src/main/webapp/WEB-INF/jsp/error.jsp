<%--
  Created by IntelliJ IDEA.
  User: david.sapo
  Date: 09.10.2021
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple 404 Error Page Design</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:700" rel="stylesheet">
    <style>
        h1 {
            font-size: 80px;
            font-weight: 800;
            text-align: center;
            font-family: 'Roboto', sans-serif;
        }

        h2 {
            font-size: 25px;
            text-align: center;
            font-family: 'Roboto', sans-serif;
            margin-top: -40px;
        }

        p {
            text-align: center;
            font-family: 'Roboto', sans-serif;
            font-size: 12px;
        }

        .container {
            width: 300px;
            margin: 0 auto;
            margin-top: 15%;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>500</h1>
    <h2>Error occurs</h2>
    <p>May be email is invalid or fields are empty or too long <a href="/email-service/form">Home Page.</a></p>
</div>
</body>
</html>
