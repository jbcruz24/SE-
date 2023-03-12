<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="SignUpStyles.css">
<meta charset="UTF-8">
<title>Sign Up</title>

<script type="text/javascript">
function valid(){
var stg1 = document.getElementById('box1').value;
var stg2 = document.getElementById('box2').value;
var stg3 = document.getElementById('box3').value;
var stg4 = document.getElementById('box4').value;
var stg5 = document.getElementById('box5').value;
if(stg1!="" && stg2!="" && stg3!="" && stg4!="" && stg5!=""){
return true;
}else{
	alert("Please fill out all the field");
return false;
}
}




</script>

</head>


<body>

<div class="form">
		
    <h2 align="center" class="header">Provide the details below to sign up.</h2>
    	
   <form action="SignUpServleet" method="post">
   	 	
   	 	<div class="email">
   	 		<label>Email</label>
   	 	</div>
     	 	<input type="email" name="email" id="box1" class="user1" placeholder="Email">	
    	
    	<div class="name">
   	 		<label>Name</label>
   	 	</div>
     	 	<input type="text" name="name" id="box2" class="user2" placeholder="Name">	
     	
     	<div class="role">
   	 		<label>Role</label>
   	 	</div>
     	 	<input type="text" name="role" id="box3" class="user3" placeholder="Dentist or Secretary">
     	 	
     	<div class="user">
   	 		<label>Username</label>
   	 	</div>
     	 	<input type="text" name="uname" id="box4" class="user4" placeholder="Username">	
    	
    	<div class="password">
   	 		<label>Password</label>
   	 	</div>
     	 	<input type="password" name="upwd" id="box5" class="user5" placeholder="Password" id="psw" name="psw" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
     	 	
     	<div class="submit">
    		<input type="submit" value="Sign Up" onclick="valid()">
    	</div>		
    	
    

</form>
</div>

</body>
</html>