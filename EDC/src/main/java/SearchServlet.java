

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String LN=request.getParameter("id");
		String FN=request.getParameter("first");
		
		out.print("<html>\r\n"
				+ "<head>"
				+ "<body>\r\n"
				+ "    <title>Px Record</title>\r\n"
				+ "    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap\" rel=\"stylesheet\">\r\n"
				+ "   <style>body{\r\n"
				+ "	background-color:white;\r\n"
				+ "font-family: Arial, Helvetica, sans-serif;"
				+ "	\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "h1{\r\n"
				+ "	float: center;\r\n"
				+ "margin-left:70px;"
				+ "margin-top: 80px;"
				+ ""
				+ "color: white;"
				
				+ "}"
				+ "table{\r\n"
				+ "	border-collapse:collapse;\r\n"
				+ "	background-color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th{"
				+ "background-color: goldenrod;}"
				+ "th, tr, td {\r\n"
				+ "border: 1px solid #ddd;\r\n"
				+ "  padding: 8px;}"
				
				+ " td:hover {\r\n"
				+ "	\r\n"
				+ "	background-color: F0E68C;\r\n"
				+ "}"
				+ "a{ background: #eecc66;\r\n"
				+ "	display: inline-block;\r\n"
				+ "	padding: 12px 36px;\r\n"
				+ "	margin: 10px 0;\r\n"
				+ "	border-radius: 40px;\r\n"
				+ "	color: #363636;\r\n"
				+ "	text-decoration: none;\r\n"
				+ "	text-transform: uppercase;\r\n"
				+ "	outline: none;\r\n"
				+ "	border: none;\r\n"
				+ "	font-weight: 500;\r\n"
				+ "	cursor: pointer;"
				+ "margin-left:650px;}"
				+ "a:hover{"
				+ "background: #d4af37;\r\n"
				+ "	transition: 0.5s ease;}"
				+ "input[type=text] {\n"
				+ "  border: 2px solid white;\n"
				+ "  border-radius: 4px;\n"
				+ "}"
				+ "#save-btn {\n"
				+ "			font-size: 1.2em;\n"
				+ "  background-color: #996600;\n"
				+ "  color: white;\n"
				+ "  padding: 10px 20px;\n"
				+ "  margin: 10px;\n"
				+ "  border-radius: 5px;\n"
				+ "  border: none;\n"
				+ "  cursor: pointer;"
				+ "		}"
				+ "</style>"
				+ "</head>");
		out.print("<h1>Px Record</h1>");
		out.print("<table><tr><th>PX_ID</th><th>Last_Name</th><th>First_Name</th><th>Middle_Name</th><th>Birth_Date</th><th>Gender</th><th>Address</th><th>Cellphone Number</th><th>Email</th><th>Occupation</th><th>Guardian</th>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root","");
			
		
		
			PreparedStatement ps = con.prepareStatement("SELECT PxRecord.Pxid, PxRecord.lastName, PxRecord.firstName, PxRecord.middleName, PxRecord.birthdate, PxRecord.gender, PxRecord.address, PxRecord.cellphone, PxRecord.email, PxRecord.occupation, PxRecord.guardian FROM edc.PxRecord WHERE lastName = ? and firstName = ?");
			
			ps.setString(1, LN);
			ps.setString(2, FN);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String birth = rs.getString(5);
				String gender = rs.getString(6);
				String addr = rs.getString(7);
				String cp = rs.getString(8);
				String email = rs.getString(9);
				String occ = rs.getString(10);
				String guardian = rs.getString(11);
				
				String DecBirth = AES.decrypt(birth);
				String DecGender = AES.decrypt(gender);
				String DecAddr = AES.decrypt(addr);
				String DecCP = AES.decrypt(cp);
				String DecEmail = AES.decrypt(email);
				String DecOcc = AES.decrypt(occ);
				String DecGuardian = AES.decrypt(guardian);
				Object id = rs.getInt(1);
				request.setAttribute("PxID", id);
				
				out.print("<form action=\"EditPxServlet\" method=\"post\">");
				out.print("<tr><td>");
				out.print("<input type=\"text\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"last\" value=" + rs.getString(2) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(4));
				out.print("</td>");
				out.print("<td>");
				out.print(DecBirth);
				out.print("</td>");
				out.print("<td>");
				out.print(DecGender);
				out.print("</td>");
				out.print("<td>");
				out.print(DecAddr);
				out.print("</td>");
				out.print("<td>");
				out.print(DecCP);
				out.print("</td>");
				out.print("<td>");
				out.print(DecEmail);
				out.print("</td>");
				out.print("<td>");
				out.print(DecOcc);
				out.print("</td>");
				out.print("<td>");
				out.print(DecGuardian);
				out.print("</td>");
				out.print("<td><br><input type=\"submit\" value=\"Edit\"></td>");
			
				
				out.print("</form>");
				out.print("</table>");
				
				
				out.print("<form action=\"ArchiveServlet\" method=\"post\">");
				out.print("<input type=\"hidden\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("<input type=\"hidden\" name=\"last\" value=" + rs.getString(2) + ">");
				out.print("<input type=\"hidden\" name=\"first\" value=" + rs.getString(3) + ">");
				out.print("<input type=\"hidden\" name=\"middle\" value=" + rs.getString(4) + ">");
				out.print("<input type=\"hidden\" name=\"birth\" value=" + rs.getString(5) + ">");
				out.print("<input type=\"hidden\" name=\"gender\" value=" + rs.getString(6) + ">");
				out.print("<input type=\"hidden\" name=\"address\" value=" + rs.getString(7) + ">");
				out.print("<input type=\"hidden\" name=\"cp\" value=" + rs.getString(8) + ">");
				out.print("<input type=\"hidden\" name=\"email\" value=" + rs.getString(9) + ">");
				out.print("<input type=\"hidden\" name=\"occupation\" value=" + rs.getString(10) + ">");
				out.print("<input type=\"hidden\" name=\"guardian\" value=" + rs.getString(11) + ">");
				out.print("<button id=\"save-btn\" onclick=\"confirmSave()\">Archive Record</button>");
				out.print("</tr>");
				out.print("</form>");
				
				out.print("<form action=\"ManageTreatment\" method=\"post\">");
				out.print("<input type=\"hidden\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("<button id=\"save-btn\" onclick=\"confirmSave()\">Manage Existing Treatment Record</button>");
				out.print("</tr>");
				out.print("</form>");
				
				out.print("<form action=\"AddManageTreatment\" method=\"post\">");
				out.print("<input type=\"hidden\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("<button id=\"save-btn\" onclick=\"confirmSave()\">Add New Treatment Record</button>");
				out.print("</tr>");
				out.print("</form>");	
				
				out.print("<form action=\"AccessIntraOral\" method=\"post\">");
				out.print("<input type=\"hidden\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("<button id=\"save-btn\" onclick=\"confirmSave()\">Access IntraOral</button>");
				out.print("</tr>");
				out.print("</form>");	
			}
			
			out.print("<p><p>");
			out.print("<a href = 'Search.jsp'>Back</a>");
			out.print( "</body>"
					+ "</html>");
			
		}catch(Exception p) {
			System.out.println(p);
		}
		
		
	}
	}