

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
 * Servlet implementation class AddManageTreatment
 */
public class AddManageTreatment extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
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
				+ "input[type=submit]{\n"
				+ "  background-color: #996600;\n"
				+ "  border: none;\n"
				+ "  border-radius: 4px;\n"
				+ "  color: white;	\n"
				+ "  cursor: pointer;\n"
				+ "}"
				+ "    </style>\n"
				+ "<script type=\"text/javascript\">\n"
				+ "function confirm() {\n"
				+ "		alert(\"Saved Successfully!\");\n"
				+ "}\n"
				+ "</script>"
				+ "  </head>\n"
				+ "  <body>\n"
				+ "    <h2>User System Logs</h2>\n"
				+ "    <table id=\"logTable\">\n"
				+ "      <tr>\n"
				+ "        <th>Date</th>\n"
				+ "        <th>Tooth No./s</th>\n"
				+ "        <th>Procedure</th>\n"
				+ "        <th>Dentist/s</th>\n"
				+ "        <th>Amount Charged</th>\n"
				+ "        <th>Amount Paid</th>\n"
				+ "        <th>Balance</th>\n");
		
		
			
				
				Object Pxid = request.getAttribute("Px");
				out.print("<form action=\"InsertManageTreatment\" method=\"post\">");
				out.print("<tr><td>");
				out.print("<input type=\"date\" name=\"date\">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"tooth\">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"procedure\">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"Dentist\">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"AmountCharged\">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"AmountPaid\">");
				out.print("</td>");
				out.print("<td>");
				out.print("<input type=\"text\" name=\"Balance\">");
				out.print("</td>");
				out.print("<td colspan=\"2\"><br><input type=\"submit\" value=\"Add\" onclick=\"confirm()\"></td>");
				out.print("</tr>");
				out.print("</table>");
				out.print("<input type=\"hidden\" name=\"id\" value= "+ id +">");
				out.print("</form>");
				
				
		out.print("</table>");
		out.print("<p><p>");
		out.print( "</body>"
				+ "</html>");
	}
	
				
}


