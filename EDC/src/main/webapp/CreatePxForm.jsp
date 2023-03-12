<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Patient Record</title>
</head>


<body>

<div class="back-button">
<button style="margin-left: 10px; margin-bottom: 10px; 
background-color: #996600;
border-radius: 5px;
width: 150px;
font-size: 20px;
padding: 10px 20px;
cursor: pointer;
"

onclick="confirmDiscard()">Back</button>
</div>
<script>
function confirmDiscard() {
  if (confirm("Do you want to discard changes?")) {
    window.location.href = "HOME_homepg.jsp";
  }
}

function valid(){
	var stg1 = document.getElementById('last-name').value;
	var stg2 = document.getElementById('first-name').value;
	var stg3 = document.getElementById('middle-name').value;
	var stg4 = document.getElementById('birthdate').value;
	var stg5 = document.getElementById('gender').value;
	var stg6 = document.getElementById('home-address').value;
	var stg7 = document.getElementById('cellphone').value;
	var stg8 = document.getElementById('email').value;
	var stg9 = document.getElementById('occupation').value;
	var stg10 = document.getElementById('guardian-name').value;
	if(stg1!="" && stg2!="" && stg3!="" && stg4!="" && stg5!="" && stg6!="" && stg7!="" && stg8!="" && stg9!="" && stg10!=""){
	return true;
	}else{
		alert("Please fill out all the field");
	return false;
	}
	}

</script>

<form action="CreatePxFormServlet" method="post" class="patient-form">


  <div class="form-section">
    <label for="last-name">Last Name:</label>
    <input type="text" id="last-name" name="last-name" required="required">
  </div>
  <div class="form-section">
    <label for="first-name">First Name:</label>
    <input type="text" id="first-name" name="first-name" required="required">
  </div>
  <div class="form-section">
    <label for="middle-name">Middle Name:</label>
    <input type="text" id="middle-name" name="middle-name">
  </div>
  <div class="form-section">
    <label for="birthdate">Birthdate:</label>
    <input type="date" id="birthdate" name="birthdate" required="required">
	
  </div>
  <div class="form-section gender-section">
  <label>Gender:</label>
  <input type="radio" id="male" name="gender" value="male" >
  <label for="male">Male</label>
  <input type="radio" id="female" name="gender" value="female">
  <label for="female">Female</label>
</div>

  <div class="form-section">
    <label for="home-address">Home Address:</label>
    <input type="text" id="home-address" name="home-address">
  </div>
  <div class="form-section">
    <label for="cellphone">Cellphone #:</label>
    <input type="text" id="cellphone" name="cellphone" pattern="[0-9]+" title="please enter number only" required="required">
  </div>
  <div class="form-section">
    <label for="email">Email Address:</label>
    <input type="email" id="email" name="email" required="required">
  </div>
  <div class="form-section">
    <label for="occupation">Occupation:</label>
    <input type="text" id="occupation" name="occupation" required="required">
  </div>
  <div class="form-section">
    <label for="guardian-name">Parent/Guardian's Name:</label>
    <input type="text" id="guardian-name" name="guardian-name" >
  </div>
  
  
  
  <input type="submit" value="Next (Medical History)" onclick="valid()">
  
  
</form>
<style>

.patient-form {
  width: 500px;
  margin: 50px auto;
  padding: 20px;
  border: 1px solid #ccc;
  box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.1);
  border-radius: 10px;
}

.form-section {
  margin-bottom: 20px;
  display: flex;
  flex-direction: column;
}

.gender-section {
  display: flex;
  flex-direction: row;
  align-items: center;
}

input[type="radio"] {
  height: 20px;
  width: 20px;
  margin-right: 10px;
}


label {
  font-weight: bold;
  margin-bottom: 10px;
}

input[type="text"],
input[type="email"],
input[type="date"],{
  height: 40px;
  font-size: 16px;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  width: 100%;
  outline: none;
}

input[type="submit"] {
  background-color: #996600;
  color: white;
  padding: 14px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  margin-top: 20px;
}

input[type="submit"]:hover {
  background-color: #996530;
}

</style>
</body>
</html>