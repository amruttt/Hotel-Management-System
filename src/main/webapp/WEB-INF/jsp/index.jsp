<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<style type="text/css">
.button {
  border: none;
  padding: 8px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

</style>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body background="hotel.jpg">
<!-- <img alt="" src="hotel.jpg" height="100%" width="100%"> -->
<h1 size=22 align="center" color="white"> Welcome To Hotel Hidden Leaf </h1>
<marquee size=12 color="blue">Welcome To Hotel Friends</marquee>
<h1 size=18 align="center" color="white"> Login To Continue </h1>
<table align="center">
<tr><td>
<button class="button" ><a href="cuslogin">User Login</a></button>
</td></tr>
<tr><td>
<button class="button"><a href="venlogin">Admin Login</a></button>
</td></tr>
</table>
</body>
</html>