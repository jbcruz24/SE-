

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

/**
 * Servlet implementation class UpdatePxServlet
 */
public class UpdatePxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String dbUrl = "jdbc:mysql://localhost:3306/edc";
    private String dbUname = "root";
    private String dbPassword = ""; //lagay mo dito kung meron password db mo
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String last = request.getParameter("last");
		String first = request.getParameter("first");
		String middle = request.getParameter("middle");
		String birthdate = request.getParameter("birthdate");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String cp = request.getParameter("cellphone");
		String email = request.getParameter("email");
		String occupation = request.getParameter("occupation");
		String guardian = request.getParameter("guardian");
		RequestDispatcher dispatcher = null;
		
		String EncBirth = AES.encrypt(birthdate);
   		String EncGender = AES.encrypt(gender);
   		String EncAddress = AES.encrypt(address);
   		String EncCellphone = AES.encrypt(cp);
   		String EncEmail = AES.encrypt(email);
   		String EncOccupation = AES.encrypt(occupation);
   		String EncGuardian = AES.encrypt(guardian);
		

			try {
				Class.forName(dbDriver);
				Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
				PreparedStatement ps = con.prepareStatement("UPDATE edc.PxRecord set lastName = ?, firstName = ?, middleName = ?, birthdate = ?, gender = ?, address = ?, cellphone = ?, email = ?, occupation = ?, guardian = ? where Pxid = ? ");
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
				ps.setString(11, id);

				int rowCount = ps.executeUpdate();
				if (rowCount > 0) {
					request.setAttribute("status", "resetSuccess");
					dispatcher = request.getRequestDispatcher("Search.jsp");
				} else {
					request.setAttribute("status", "resetFailed");
				}
				dispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


