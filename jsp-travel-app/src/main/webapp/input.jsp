<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Travel Agency</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="controller.jsp">
<span>Name:</span> <input type="text" name="username"><br/>
<span>Age:</span> <input type="number" name="age"><br/>
<input type="submit" value="Validate">
</form>
</body>
</html>