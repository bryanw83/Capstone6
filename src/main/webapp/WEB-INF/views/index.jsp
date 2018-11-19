<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cyborg/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4DAPMwiyOJv/C/LvTiUsW5ueiD7EsaAhwUKO0Llp+fWzT40XrmAbayhVP00bAJVa"
	crossorigin="anonymous">
<link rel="stylesheet" href="main.css">
</head>
<body>

	<h1>GC Employee Task Database</h1><br><br>
	
	<h2>Employee Login<br><br>
	
	<div class="formstyle">
		<form action="login" onsubmit="return validateInfo();">
			User Name: <input type="text" name="username"> 
			<input type="submit" value="Who You Be?"> <br><br>
			Password: <input type="text" name="userpassword"> 
			<input type="submit" value="What It Be?"> 

		</form>
	</div>
	
	</h2>


</body>
</html>