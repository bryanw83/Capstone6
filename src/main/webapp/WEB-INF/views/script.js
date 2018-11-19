function validateInfo(){
	//1. get the text box value
	var first = document.getElementById("firstName").value;
	var last = document.getElementById("lastName").value;
	var userEmail = document.getElementById("email").value;
	var phoneNum = document.getElementById("phoneNum").value;
	var password = document.getElementById("password").value;
	
	
	if (first.length <= 2){
		alert("Please enter a full first name!");
		document.getElementById("firstname").focus();
		return false;
	}
	if (last.length <= 2){
		alert("Please enter a full last name!");
		document.getElementById("lastname").focus();
		return false;
	}
	if (userEmail.matches("[\\w,-]{5,30}@\\w{5,10}[.]\\w{2,3}")){
		return true;
	}else {
		alert("Please enter a valid email address!");
		document.getElementById("email").focus();
		return false;
	}
	if (phoneNum.matches("\\d{3}-\\d{3}-\\d{4}")){
		return true;
	} else{
		alert("Please enter a valid phone number (including area code)!");
		document.getElementById("phoneNum").focus();
		return false;
	}
	if (password.length < 6){
		alert("Password must be at least 6 characters long!");
		document.getElementById("password").focus();
		return false;
	}
	
function confirmChoice(){
	var choice = document.getElementById("choice").value;
	alert("Selection Saved!");
	document.getElementById("choice").focus();
	return true;
}
}