<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css" rel="stylesheet" integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er" crossorigin="anonymous">
</head>
<body>
<h2>Add Task</h2>
<form action="add-details">
<input type="text" name="description" placeholder="Enter Description">
<input type="text" name="duedate" placeholder="Enter Due Date">
<input type="text" name="complete" placeholder="Yes or No">
<input type="text" name="useremail" placeholder="Enter Email">
<input type="submit" value="Add Task">


</form>

</body>
</html>