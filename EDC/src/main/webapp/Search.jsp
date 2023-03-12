<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Patient Record</title>
</head>
<style>
div.form{
  position: relative;
  top: 50px;
 
}

.header2{
  position: relative;
  font-family: Arial, Helvetica, sans-serif;
  color: gold;
  font-size: 30px;
  left: 580px;
  bottom: 20px;
}

.header1{
  position: relative;
  font-family: Arial, Helvetica, sans-serif;
  color: #996600;
  font-size: 35px;
  left: 530px;
  bottom: 40px
}

.icon{
	position: relative;
	top: 50px;
	left: 500px;
}

.lastname{
  font-family: Arial, Helvetica, sans-serif;
  position: relative;
  bottom: 5px;
  left: 600px;
  font-size: 15px;
  
}

.firstname{
  font-family: Arial, Helvetica, sans-serif;
  position: relative;
  top: 15px;
  left: 600px;
  font-size: 15px;
}

.last{
	height: 20px;
	border: 2px solid #996600;
	margin-left: 600px;
}

.first{
	height: 20px;
	border: 2px solid #996600;
	margin-left: 600px;
	margin-top: 20px;
}

input[type=submit]{
  background-color: #996600;
  border: none;
  border-radius: 4px;
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
  color: white;	
  padding: 10px 25px;
  margin: 60px 650px;
  cursor: pointer;
}

div.home{
  position: relative;
  font-family: Arial, Helvetica, sans-serif;
  bottom: 550px;
  left: 50px;
  font-size: 25px;
}


</style>

<body>
<div class="form">

	<div class="icon">
	   	<img src="dental.png" style=" width:75px; height:70px;">
	</div>
	
	<div class="header2">
    	<p>Executive Dental Clinic</p>
    </div>
    
    <div class="header1">	
    	<p>Search Patient Record</p>
	</div>

<form action="SearchServlet" method="post">

<div class="lastname">
   	 		<label>Last Name:</label>
   	 	</div>
     	 	<input type="text" name="id" class="last" required>	
    	
    	
    	<div class="firstname">
   	 		<label>First Name:</label>
   	 	</div>
     	 	<input type="text" name="first" class="first" required>	
     	 	
     	 <div class="submit">
    		<input type="submit" value="Search">
    	</div>
    	
    	<div class="home">
			<a href="HOME_homepg.jsp">Back to Homepage</a>
		</div>
		
</form>
</div>
</body>
</html>