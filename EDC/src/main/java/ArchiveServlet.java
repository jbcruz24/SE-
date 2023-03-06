

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class ArchiveServlet
 */@WebServlet("/ArchiveServlet")
public class ArchiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Pxid = request.getParameter("id");
		String LN=request.getParameter("last");
		String FN=request.getParameter("first");
		String MN=request.getParameter("middle");
		String BD=request.getParameter("birth");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String cp=request.getParameter("cp");
		String email=request.getParameter("email");
		String occupation=request.getParameter("occupation");
		String guardian=request.getParameter("guardian");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root",""); 
			
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			HttpSession session = request.getSession();
			Object id = session.getAttribute("AdminID");
			request.setAttribute("status", "success");
			PreparedStatement ps = con.prepareStatement("INSERT INTO edc.Archive(AdminID, PxID, lastName, firstName, middleName, birthDate, gender, address, cellphone, email, occupation, guardian, timeCreated) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ");
	   		//System.out.print(id);
	   		//System.out.print(last);
	   		//System.out.print(first);
			
			ps.setObject(1, id);
			ps.setString(2, Pxid);
			ps.setString(3, LN);
			ps.setString(4, FN);
			ps.setString(5, MN);
			ps.setString(6, BD);
			ps.setString(7, gender);
			ps.setString(8, address);
			ps.setString(9, cp);
			ps.setString(10, email);
			ps.setString(11, occupation);
			ps.setString(12, guardian);
			ps.setTimestamp(13, date);
			
			int i = ps.executeUpdate();
			if(i > 0) {
			PreparedStatement ps2 = con.prepareStatement("DELETE FROM PxRecord WHERE lastName = ? and firstName = ?");
	   		ps2.setString(1, LN);
	   		ps2.setString(2, FN);
	   		//System.out.print(LN);
		
	   		ps2.execute();
			}
			RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
			rd.forward(request, response);
	   		
		
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}