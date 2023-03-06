

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 	private String dbUrl = "jdbc:mysql://localhost:3306/edc";
	    private String dbUname = "root";
	    private String dbPassword = ""; //lagay mo dito kung meron password db mo
	    private String dbDriver = "com.mysql.cj.jdbc.Driver";


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			PrintWriter out = response.getWriter();
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
			String username = request.getParameter("uname");
			String password = request.getParameter("upwd");
		
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM edc.Admin WHERE username=? and password=?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			
			
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("HOME_homepg.jsp");
				rd.forward(request, response);
				
				//this get the name column in the db then decrypts it
				//String ds = rs.getString("name");
				//String dec = AES.decrypt(ds);
				//System.out.print(dec);
				
				
				//this get the adminID in the database
				HttpSession session = request.getSession();
				int adminID = rs.getInt(1);
				String role = rs.getString("role");
				session.setAttribute("AdminID", adminID);
				
				
				System.out.print(adminID);
				System.out.print(role);
				System.out.print(date);
				
				
				PreparedStatement ps2 = con.prepareStatement("INSERT INTO edc.SystemLogs(AdminID,role,login) VALUES(?,?,?)");
				ps2.setInt(1, adminID);
				ps2.setString(2, role);
				ps2.setTimestamp(3, date);
				ps2.executeUpdate();
				
				
			}
			else {
				response.sendRedirect("login.jsp?msg=wrong");
				
			}

			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
