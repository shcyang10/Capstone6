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
<h1>Task List</h1>
<br>
<br>
<!-- </form>
		<form action="add-task">
		<button type="submit" name="addTask" value="Add Task">Add Task</button>
		</form> -->
<table class="table">
  <tr>
    <th>ID</th>
    <th>Description</th>
    <th>Due Date</th>
    <th>Complete</th>
  </tr>
  <c:forEach var="task" items="${userTask }">
  <tr>
    <td>${task.taskid }</td>
    <td>${task.description }</td>
    <td>${task.duedate}</td>
    <td><c:if test="${task.complete eq 'yes' }"> Complete </c:if>
    <c:if test="${task.complete eq 'no' }"> 
    
  	<form action="mark-complete">
    <input type="hidden" value="${task.taskid }" name="id">
    <input class="btn btn-primary" type="submit" value="Mark Complete">
     </form>
<%--      <input type="checkbox" onclick="window.location.href='/mark-complete?id=${task.taskid }'">${task.taskid  }
 --%>     </c:if>
 

   </td>
  
  </tr>
  </c:forEach>
</table>
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