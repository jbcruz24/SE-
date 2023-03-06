

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
 * Servlet implementation class CreatePxFormServlet
 */
@WebServlet("/CreatePxFormServlet")
public class CreatePxFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String dbUrl = "jdbc:mysql://localhost:3306/edc";
	private String dbUname = "root";
	private String dbPassword = ""; //lagay mo dito kung meron password db mo
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
			String last = request.getParameter("last-name");
	   		String first = request.getParameter("first-name");
	   		String middle = request.getParameter("middle-name");
	   		String birth = request.getParameter("birthdate");
	   		String gender = request.getParameter("gender");
	   		String address = request.getParameter("home-address");
	   		String cellphone = request.getParameter("cellphone");
	   		String email = request.getParameter("email");
	   		String occupation = request.getParameter("occupation");
	   		String guardian = request.getParameter("guardian-name");
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

	   		
	   		String EncBirth = AES.encrypt(birth);
	   		String EncGender = AES.encrypt(gender);
	   		String EncAddress = AES.encrypt(address);
	   		String EncCellphone = AES.encrypt(cellphone);
	   		String EncEmail = AES.encrypt(email);
	   		String EncOccupation = AES.encrypt(occupation);
	   		String EncGuardian = AES.encrypt(guardian);
	   		
	   		
	   		PreparedStatement ps = con.prepareStatement("INSERT INTO edc.PxRecord(lastName, firstName, middleName, birthdate, gender, address, cellphone, email, occupation, guardian) VALUES(?,?,?,?,?,?,?,?,?,?) ");
	   		ps.setString(1, last);
			ps.setString(2, first);
			ps.setString(3, middle);
			ps.setString(4, EncBirth);
			ps.setString(5, EncGender);
			ps.setString(6, EncAddress);
			ps.setString(7, EncCellphone);
			ps.setString(8, EncEmail);
			ps.setString(9, EncOccupation);
			ps.setString(10, EncGuardian);
			
			int i = ps.executeUpdate();
			if(i > 0) {
				HttpSession session = request.getSession();
				Object id = session.getAttribute("AdminID");
				request.setAttribute("status", "success");
			}
			RequestDispatcher rd = request.getRequestDispatcher("MedicalHistory.jsp");
			rd.forward(request, response);
	   		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
