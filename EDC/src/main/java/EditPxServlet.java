

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

/**
 * Servlet implementation class EditPxServlet
 */
public class EditPxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String LN=request.getParameter("last");
		String id=request.getParameter("id");
		out.print("<html>\r\n"
				+ "<head>"
				+ "<body>\r\n"
				+ "    <title>Px Record</title>\r\n"
				+ "    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap\" rel=\"stylesheet\">\r\n"
				+ "   <style>body{\r\n"
				+ "	background-color:#white;\r\n"
				+ "font-family: Arial, Helvetica, sans-serif;"
				+ "	\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "h1{\r\n"
				+ "	float: center;\r\n"
				+ "margin-left:170px;"
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
				+ "input[type=\"submit\"] {\n"
				+ "  background-color: #996600;\n"
				+ "  color: white;\n"
				+ "  padding: 14px 20px;\n"
				+ "  border: none;\n"
				+ "  border-radius: 5px;\n"
				+ "  cursor: pointer;\n"
				+ "  font-size: 16px;\n"
				+ "  margin-top: 20px;\n"
				+ "}\n"
				+ "\n"
				+ "input[type=\"submit\"]:hover {\n"
				+ "  background-color: #996530;\n"
				+ "}"
				+ "</style>"
				+ "<script type=\"text/javascript\">\n"
				+ "function confirm() {\n"
				+ "		alert(\"Patient record saved successfully!\");\n"
				+ "}\n"
				+ "</script>"
				+ "</head>");
		out.print("<h1>Px Record</h1>");
		out.print("<table><tr><th>PX_ID</th><th>Last_Name</th><th>First_Name</th><th>Middle_Name</th><th>Birth_Date</th><th>Gender</th><th>Address</th><th>Cellphone Number</th><th>Email</th><th>Occupation</th><th>Guardian</th>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root","");
			
		
		
			PreparedStatement ps = con.prepareStatement("SELECT PxRecord.Pxid, PxRecord.lastName, PxRecord.firstName, PxRecord.middleName, PxRecord.birthdate, PxRecord.gender, PxRecord.address, PxRecord.cellphone, PxRecord.email, PxRecord.occupation, PxRecord.guardian FROM edc.PxRecord WHERE lastName = ? and Pxid = ?");
			
			ps.setString(1, LN);
			ps.setString(2, id);
			
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
				
				out.print("<form action=\"UpdatePxServlet\" method=\"post\">");
				out.print("<tr><td>");
				out.print("<input type=\"text\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"last\" value=" + rs.getString(2) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"first\" value=" + rs.getString(3) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"middle\" value=" + rs.getString(4) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"birthdate\" value=" + DecBirth + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"gender\" value=" + DecGender + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"address\" value=" + DecAddr + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"cellphone\" value=" + DecCP + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"email\" value=" + DecEmail + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"occupation\" value=" + DecOcc + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"guardian\" value=" + DecGuardian + ">");
				out.print("</td>");
				out.print("<td colspan=\"2\"><br><input type=\"submit\" value=\"Update\" onclick=\"confirm()\"></td>");
				out.print("</tr>");
				out.print("</table>");
				out.print("</form>");
				System.out.print(LN);
				
			
			}
			
			
		}catch(Exception p) {
			System.out.println(p);
		}
		
		//add manage treatment record
		
		out.print("</table>");
		out.print("<p><p>");
		out.print("<a href = 'Search.jsp'>Back to Searching</a>");
		out.print( "</body>"
				+ "</html>");
	}
	}