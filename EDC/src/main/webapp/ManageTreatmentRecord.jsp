<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>User System Logs</title>
    <style>
      #logTable {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
      }

      #logTable td, #logTable th {
        border: 1px solid #ddd;
        padding: 8px;
      }

      #logTable tr:nth-child(even){background-color: #f2f2f2;}

      #logTable tr:hover {background-color: #ddd;}

      #logTable th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
      }
    </style>
  </head>
  <body>
  <a href="Homepage.html" class="back-button">Back</a>
    <h2>User System Logs</h2>
    <table id="logTable">
      <tr>
        <th>Date</th>
        <th>Tooth No./s</th>
        <th>Procedure</th>
        <th>Dentist/s</th>
        <th>Amount Charged</th>
        <th>Amount Paid</th>
        <th>Balance</th>
      </tr>
      <form action="ManageTreatmentServlet" method="post">
      <tr>
        <td>
        <input type="date" name="date">
        </td>
       
     
        <td>
        <input type="text" name="tooth">
        </td>
        
    
        <td>
        <input type="text" name="procedure">
        </td>
    
        <td>
        <input type="text" name="Dentist">
        </td>
    
        <td>
        <input type="text" name="amountCharged">
        </td> 
      
        <td>
        <input type="text" name="amountPaid">
        </td>   
  
        <td>
        <input type="text" name="balance">
        </td>
      </tr>
      
       <input type="submit" value="Save">
  </form>
 </table>
  </body>
</html>
