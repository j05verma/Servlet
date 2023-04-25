<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<%
	String user = (String) session.getAttribute("user");
	%>
	<%
	if (user != null) {
	%>

	<h1>Welcome to my Application</h1>
	<h2>Your Login is Succesful</h2>
	<h3>This is Your Home Page</h3>

	<h3>
		<a href="logout">SingOut</a>
	</h3>

	<%
	} else {
	response.sendRedirect("login.jsp");
	}
	%>
</body>
</html>