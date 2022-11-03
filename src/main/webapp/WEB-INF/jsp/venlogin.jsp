<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="./base.jsp"%>
</head>
<body background="hotel.jpg">
<div align="center">
<h1> Vendor Login </h1>
</div>
<form action=venAuthenticatelogin method=post>
<table align="center">
<tr><td>Enter Username:</td><td><input type=text name=venUsername></td></tr>
<tr><td>Enter Password:</td><td><input type=password name=venPassword></td></tr>
<!-- <tr><td><a href="forget.jsp">Forget Password</a></td></tr> -->
<tr><td><input type=submit value=Login></td><td><input type=reset></td></tr>
</table>
</form>
</body>
</html>