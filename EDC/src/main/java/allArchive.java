

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
 * Servlet implementation class AllArchive
 */
@WebServlet("/allArchive")
public class allArchive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		out.print("<html>\n"
				+ "  <head>\n"
				+ "    <title>Archive Record</title>\n"
				+ "    <style>\n"
				+ "      #logTable {\n"
				+ "        font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n"
				+ "        border-collapse: collapse;\n"
				+ "        width: 100%;\n"
				+ "      }\n"
				+ "\n"
				+ "      #logTable td, #logTable th {\n"
				+ "        border: 1px solid #ddd;\n"
				+ "        padding: 8px;\n"
				+ "      }\n"
				+ "\n"
				+ "      #logTable tr:nth-child(even){background-color: #f2f2f2;}\n"
				+ "\n"
				+ "      #logTable tr:hover {background-color: #ddd;}\n"
				+ "\n"
				+ "      #logTable th {\n"
				+ "        padding-top: 12px;\n"
				+ "        padding-bottom: 12px;\n"
				+ "        text-align: left;\n"
				+ "        background-color: #996600;\n"
				+ "        color: white;\n"
				+ "      }\n"
				+ "input[type=text] {\n"
				+ "  border: 2px solid white;\n"
				+ "}"
				+ ".header{\n"
				+ "  font-family: Arial, Helvetica, sans-serif;\n"
				+ "  color: gold;\n"
				+ "  font-size: 30px;\n"
				+ "  left: 580px;\n"
				+ "  bottom: 20px;\n"
				+ "}"
				+ "input[type=submit]{\n"
				+ "  background-color: #996600;\n"
				+ "  border: none;\n"
				+ "  border-radius: 4px;\n"
				+ "  color: white;	\n"
				+ "  cursor: pointer;\n"
				+ "}"
				+ "    </style>\n"
				+ "  </head>\n"
				+ "  <body>\n"
				+ "    <h2 class=header align = center>Archive Record</h2>\n"
				+ "    <table id=\"logTable\">\n"
				+ "      <tr>\n"
				+ "        <tr><th>archID</th><th>adminID</th><th>PXID</th><th>Last_Name</th><th>First_Name</th><th>Middle_Name</th><th>Birth_Date</th><th>Gender</th><th>Address</th><th>Cellphone Number</th><th>Email</th><th>Occupation</th><th>Guardian</th><th>timeCreated</th></th>\n");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root","");
			
		
		
			PreparedStatement ps = con.prepareStatement("SELECT Archive.ArchID, Archive.AdminID, Archive.PxID, Archive.lastName, Archive.firstName, Archive.middleName, Archive.birthDate, Archive.gender, Archive.address, Archive.cellphone, Archive.email, Archive.occupation, Archive.guardian, Archive.timeCreated FROM edc.Archive");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String birth = rs.getString(7);
				String gender = rs.getString(8);
				String addr = rs.getString(9);
				String cp = rs.getString(10);
				String email = rs.getString(11);
				String occ = rs.getString(12);
				String guardian = rs.getString(13);
				
				String DecBirth = AES.decrypt(birth);
				String DecGender = AES.decrypt(gender);
				String DecAddr = AES.decrypt(addr);
				String DecCP = AES.decrypt(cp);
				String DecEmail = AES.decrypt(email);
				String DecOcc = AES.decrypt(occ);
				String DecGuardian = AES.decrypt(guardian);
				
				
				out.print("<form action=\"SearchArchiveServlet\" method=\"post\">");
				out.print("<tr><td>");
				out.print("<input type=\"text\" name=\"id\" value=" + rs.getInt(1) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"id2\" value=" + rs.getInt(2) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"id3\" value=" + rs.getString(3) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"last\" value=" + rs.getString(4) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"first\" value=" + rs.getString(5) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"middle\" value=" + rs.getString(6) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"birth\" value=" + DecBirth + ">");
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
				out.print("<td>");
				out.print("<input type=\"text\" name=\"time\" value=" + rs.getTimestamp(14) + ">");
				out.print("</td>");	
				out.print("<td colspan=\"2\"><br><input type=\"submit\" value=\"Edit\"></td>");
				out.print("</tr>");
				
				out.print("</form>");
			}
			
			out.print("</table>");
			
			
		}catch(Exception p) {
			System.out.println(p);
		}
		
		
	}
}