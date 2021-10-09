<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Email Service</title>
</head>
<body>

<h2 align="center">Email client by David Sapoznik</h2>

<div class="container">
    <form:form modelAttribute="form" method="POST" enctype="multipart/form-data">
        <table align="center">
            <tr>
                <td>Email</td>
                <br>
                <td><form:input path="email"/></td>
                <br>
            </tr>
            <tr>
                <td>Subject</td>
                <br>
                <td><form:input path="subject"/></td>
                <br>
            </tr>
            <tr>
                <td>Body</td>
                <br>
                <td><form:textarea path="body"/></td>
                <br>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>
                    <button type="submit" value="Submit">Send</button>
                    <button type="reset" value="Reset">Reset</button>
                </td>
                <td>
            </tr>
        </table>
    </form:form>
</div>

<style>

</style>

</body>
</html>