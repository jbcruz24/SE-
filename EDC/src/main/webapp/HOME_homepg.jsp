<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="HomepageCSSs.css">
<title>HOMEPAGE</title>
</head>
<body>
<div id="header">
  <img src="dental.png" alt="Executive Dental Clinic logo">
  <h1>Executive Dental Clinic</h1>
</div>

<form action="LogoutServlet" method="post">
<div class="logout">
    		<input type="submit" value="Logout">
    	</div>

</form>

<div id="main-content">

<button id="create-record-btn">Create Patient Record</button>
<button id="manage-records-btn">Manage Patient Records</button>
<button id="access-archive-btn">Access Archive</button>

<form action="SystemLogsServlet" method="post">
<div class="submit">
    		<input type="submit" value="Access System Logs">
    	</div>

</form>
<script>

document.getElementById("create-record-btn").addEventListener("click", function(){
  window.location.href = "CreatePxForm.jsp";
});

document.getElementById("manage-records-btn").addEventListener("click", function(){
  window.location.href = "Search.jsp";
});

document.getElementById("access-archive-btn").addEventListener("click", function(){
  window.location.href = "SearchArchive.jsp";
});

document.getElementById("access-logs-btn").addEventListener("click", function(){
  window.location.href = "SystemLogs.jsp";
});

document.getElementById("log-out").addEventListener("click", function(){
  window.location.href = "login.jsp";
});
</script>

</body>
</html>