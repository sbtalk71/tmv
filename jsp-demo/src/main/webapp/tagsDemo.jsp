<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>
<%!int a=10,b=20; %>

<h1>Sum=<%out.println(a+b); %></h1>

<h2>The Sum=<%=(a+b) %></h2>
</body>
</html>