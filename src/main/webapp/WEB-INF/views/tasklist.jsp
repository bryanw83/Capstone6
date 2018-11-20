<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cyborg/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4DAPMwiyOJv/C/LvTiUsW5ueiD7EsaAhwUKO0Llp+fWzT40XrmAbayhVP00bAJVa"
	crossorigin="anonymous">
<link rel="stylesheet" href="main.css">
</head>
<body>

<h1>Employee Task List</h1><br>
<a class="btn btn-primary" href="logout">Logout</a><br><br>



	<table>
		<thead>
			<tr>
				<td>Task ID</td>
				<td>Task Name</td>
				<td>Task Description</td>
				<td>Task Status</td>
				<td>User ID</td>
			</tr>
		</thead>
		
		<c:forEach var="t" items="${usertasks}">
			<tbody>
				<tr>
					<td>${t.taskid}</td><br>
					<td>${t.taskname}</td><br>
					<td>${t.taskdescription}</td><br>
					<td>${t.taskstatus}</td><br>
					<td>${t.userid}</td>
				</tr>
			</tbody>
		</c:forEach>
	
	
	</table>

</body>
</html>