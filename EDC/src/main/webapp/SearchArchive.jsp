<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Archive Record</title>
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
  left: 400px;
  font-size: 15px;
  
}

.firstname{
  font-family: Arial, Helvetica, sans-serif;
  position: relative;
  top: 15px;
  left: 400px;
  font-size: 15px;
}

.last{
	height: 20px;
	border: 2px solid #996600;
	margin-left: 400px;
}

.first{
	height: 20px;
	border: 2px solid #996600;
	margin-left: 400px;
	margin-top: 20px;
}

input[type=submit]{
  background-color: #996600;
  border: none;
  border-radius: 4px;
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
  color: white;	
  padding: 10px 25px;
  margin: 60px 450px;
  cursor: pointer;
}

div.home{
  position: relative;
  font-family: Arial, Helvetica, sans-serif;
  bottom: 550px;
  left: 50px;
  font-size: 25px;
}

#archive{
	position:relative;
	font-size: 15px;
	background-color: #996600;
	color: white;
	padding: 10px 20px;
	box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
	margin-left: 778px;
	bottom:250px;
	border-radius: 4px;
	border: none;
	cursor: pointer;
}
#or{
position:relative;
margin-left: 685px;
top:90px;
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
    	<p>Search Archive Record</p>
	</div>
<h6 id="or">or</h6>
<form action="SearchArchiveServlet" method="post">

<div class="lastname">
   	 		<label>Last Name:</label>
   	 	</div>
     	 	<input type="text" name="id" class="last">	
    	
    	
    	<div class="firstname">
   	 		<label>First Name:</label>
   	 	</div>
     	 	<input type="text" name="first" class="first">	
     	 	
     	 <div class="submit">
    		<input type="submit" value="Search">
    	</div>
    	
    	<div class="home">
			<a href="HOME_homepg.jsp">Back to Homepage</a>
		</div>
		
</form>



<form action="allArchive" method="post">

    	<button id="archive">Generate All Archived Record</button>
   
</form>
</div>
</body>
</html>