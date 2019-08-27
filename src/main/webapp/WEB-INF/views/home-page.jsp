<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
</head>
<body>
	
		<h1>Welcome to Task Master</h1>
		<br>
		${message }
		<br>
		<h3>Login</h3>
		<h5>Or register below if you are not a member</h5>
		<form action="login-info">
			Email: <input type="text" name="email" placeholder="Email">
			Password: <input type="password" name="password" placeholder="Password">
			<input type="submit" value="Submit">
		</form>
		<br> <br>
		<h3>Register here</h3>
		<form action="registration">
			<button type="submit" name="Register" value="Register">Register</button>
		
		
		<%-- 	<c:forEach var="f" items="${taskTest }">
	${f.description }<br>
	
	</c:forEach> --%>

</body>
</html>