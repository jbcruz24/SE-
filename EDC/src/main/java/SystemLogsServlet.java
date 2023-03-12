

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
 * Servlet implementation class SystemLogsServlet
 */
public class SystemLogsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		out.print("<html>\n"
				+ "  <head>\n"
				+ "    <title>User System Logs</title>\n"
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
				+ "    </style>\n"
				+ "  </head>\n"
				+ "  <body>\n"
				+ "  <div class=\"back-button\">\n"
				+ "<button style=\"margin-left: 10px; margin-bottom: 10px; \n"
				+ "background-color: #996600;\n"
				+ "border-radius: 5px;\n"
				+ "width: 150px;\n"
				+ "font-size: 20px;\n"
				+ "padding: 10px 20px;\n"
				+ "cursor: pointer;\n"
				+ "\"\n"
				+ "\n"
				+ "onclick=\"confirmDiscard()\">Back</button>\n"
				+ "</div>\n"
				+ "<script>\n"
				+ "function confirmDiscard() {\n"
				+ "    window.location.href = \"HOME_homepg.jsp\";\n"
				+ "}\n"
				+ "</script>");
		out.print(" <h2>User System Logs</h2>\n"
				+ "    <table id=\"logTable\"> <tr>\n"
				+ "        <th>LogsID</th>\n"
				+ "        <th>AdminID</th>\n"
				+ "        <th>Role</th>\n"
				+ "        <th>Login Time</th>\n"
				+ "      </tr>");
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root","");
			
		
		
			PreparedStatement ps = con.prepareStatement("SELECT SystemLogs.logsID, SystemLogs.AdminID, SystemLogs.role, SystemLogs.login FROM edc.SystemLogs, edc.Admin");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				out.print("<tr><td>");
				out.print(rs.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getInt(2));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getTimestamp(4));
				out.print("</td>");
				out.print("</tr>");
			}
		
		}catch(Exception p) {
			System.out.println(p);
		}
		
		out.print("</table>");
		
	}
		
		
	}


