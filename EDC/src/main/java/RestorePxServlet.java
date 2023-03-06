

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
 * Servlet implementation class RestorePxServlet
 */
public class RestorePxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id3");
		String last = request.getParameter("last");
   		String first = request.getParameter("first");
   		String middle = request.getParameter("middle");
   		String birth = request.getParameter("birth");
   		String gender = request.getParameter("gender");
   		String address = request.getParameter("address");
   		String cellphone = request.getParameter("cellphone");
   		String email = request.getParameter("email");
   		String occupation = request.getParameter("occupation");
   		String guardian = request.getParameter("guardian");
   		
   		String EncBirth = AES.encrypt(birth);
   		String EncGender = AES.encrypt(gender);
   		String EncAddress = AES.encrypt(address);
   		String EncCellphone = AES.encrypt(cellphone);
   		String EncEmail = AES.encrypt(email);
   		String EncOccupation = AES.encrypt(occupation);
   		String EncGuardian = AES.encrypt(guardian);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/edc","root","");
			
			//java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			//HttpSession session = request.getSession();
			//Object id = session.getAttribute("AdminID");
			request.setAttribute("status", "success");
			PreparedStatement ps = con.prepareStatement("INSERT INTO edc.PxRecord(Pxid, lastName, firstName, middleName, birthdate, gender, address, cellphone, email, occupation, guardian) VALUES(?,?,?,?,?,?,?,?,?,?,?) ");
			ps.setString(1, id);
			ps.setString(2, last);
			ps.setString(3, first);
			ps.setString(4, middle);
			ps.setString(5, EncBirth);
			ps.setString(6, EncGender);
			ps.setString(7, EncAddress);
			ps.setString(8, EncCellphone);
			ps.setString(9, EncEmail);
			ps.setString(10, EncOccupation);
			ps.setString(11, EncGuardian);
			
			int i = ps.executeUpdate();
			if(i > 0) {
			PreparedStatement ps2 = con.prepareStatement("DELETE FROM Archive WHERE lastName = ? and firstName = ?");
	   		ps2.setString(1, last);
	   		ps2.setString(2, first);
	   		//System.out.print(LN);
		
	   		ps2.execute();
			}
			RequestDispatcher rd = request.getRequestDispatcher("SearchArchive.jsp");
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