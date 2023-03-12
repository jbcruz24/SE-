

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
 * Servlet implementation class EditManageTreatment
 */
public class EditManageTreatment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String treatmentID=request.getParameter("treatmentID");
		
		out.print("<html>\n"
				+ "  <head>\n"
				+ "    <title>Treatment Record</title>\n"
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
				+ "        background-color: #4CAF50;\n"
				+ "        color: white;\n"
				+ "      }\n"
				+ "input[type=text] {\n"
				+ "  border: 2px solid white;\n"
				+ "}"
				+ "    </style>\n"
				+ "<script type=\"text/javascript\">\n"
				+ "function confirm() {\n"
				+ "		alert(\"Patient record Saved Successfully!\");\n"
				+ "}\n"
				+ "</script>"
				+ "  </head>\n"
				+ "  <body>\n"
				+ "    <h2>Treatment Record</h2>\n"
				+ "    <table id=\"logTable\">\n"
				+ "      <tr>\n"
				+ "        <th>Date</th>\n"
				+ "        <th>Tooth No./s</th>\n"
				+ "        <th>Procedure</th>\n"
				+ "        <th>Dentist/s</th>\n"
				+ "        <th>Amount Charged</th>\n"
				+ "        <th>Amount Paid</th>\n"
				+ "        <th>Balance</th>\n");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root","");
			
		
		
			PreparedStatement ps = con.prepareStatement("SELECT PxTreatmentRecord.TreatmentID, PxTreatmentRecord.Pxid, PxTreatmentRecord.treatmentDate, PxTreatmentRecord.toothNum, PxTreatmentRecord.proc, PxTreatmentRecord.dentist, PxTreatmentRecord.amntCharged, PxTreatmentRecord.amntPaid, PxTreatmentRecord.balance FROM edc.PxTreatmentRecord WHERE TreatmentID = ? and Pxid = ?");
			
			ps.setString(1, treatmentID);
			ps.setString(2, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				out.print("<form action=\"UpdateManageTreatment\" method=\"post\">");
				out.print("<input type=\"hidden\" name=\"treatmentID\" value=" + rs.getInt(1) + ">");
				out.print("<input type=\"hidden\" name=\"id\" value=" + rs.getInt(2) + ">");
				out.print("<tr><td>");
				out.print("<input type=\"text\" name=\"date\" value=" + rs.getString(3) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"tooth\" value=" + rs.getString(4) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"procedure\" value=" + rs.getString(5) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"Dentist\" value=" + rs.getString(6) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"AmountCharged\" value=" + rs.getString(7) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"AmountPaid\" value=" + rs.getString(8) + ">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"Balance\" value=" + rs.getString(9) + ">");
				out.print("</td>");
				out.print("<td colspan=\"2\"><br><input type=\"submit\" value=\"Update\" onclick=\"confirm()\"></td>");
				out.print("</tr>");
				//out.print("</table>");
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