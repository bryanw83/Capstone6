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

	<div class="container">
		<div class="jumbotron">
			<h1>Welcome the GC Soccer League</h1>
		</div>
		
				${message }
			<div class="row">
		<div class="col-lg-3">
			<h2>Login</h2>
		</div>
		</div>
		<div class="row"> 
		<div class="col-lg-3">
			<form class="mb-2 mr-2" action="login-request">
			
				<div class="form-group mx-sm-3 mb-2 ">
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="username">Username: </label>
						<input id="username" class="form-control mx-sm-3 mb-2"  type="text" name="username" required>
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="userpassword">Password: </label>
						<input id="userpassword" class="form-control mx-sm-3 mb-2"  type="password" name="userpassword" required>
					</div>
			
					<input class="form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Login"></div>
	
			</form>
		</div>
		</div><br><br>
				
	<div class="row">
		<div class="col-lg-3">
			<h2>Register</h2>
		</div>
		</div>
		<div class="row"> 
		<div class="col-lg-3">
			<form class="mb-2 mr-2" action="login-confirmed">
			
				<div class="form-group mx-sm-3 mb-2 ">
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="uname">Username: </label>
						<input id="uname" class="form-control mx-sm-3 mb-2"  type="text" name="username" required>
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="pass">Password: </label>
						<input id="pass" class="form-control mx-sm-3 mb-2"  type="password" name="password" required>
					</div>
			
					<input class=" form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Register"></div>
	
			</form>
		</div>
		</div>

	</div>
</body>
</html>