<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>controller</title>
</head>
<body>
	<%
	String name = request.getParameter("username");
	String age = request.getParameter("age");

	if(!age.equals("")){
	int userAge = Integer.parseInt(age);

	if (userAge < 18) {
	%>
	<jsp:forward page="minor.jsp" />
	<%
	} else {
	%>
	<jsp:forward page="major.jsp" />
	<%
	}}else{
	%>
	<jsp:forward page="error.jsp"/>
	<%} %>
</body>
</html>