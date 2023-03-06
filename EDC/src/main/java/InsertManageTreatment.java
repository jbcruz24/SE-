

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
 * Servlet implementation class InsertManageTreatment
 */
public class InsertManageTreatment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbUrl = "jdbc:mysql://localhost:3306/edc";
    private String dbUname = "root";
    private String dbPassword = ""; //lagay mo dito kung meron password db mo
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id=request.getParameter("id");
			String date = request.getParameter("date");
			String tooth = request.getParameter("tooth");
			String proc = request.getParameter("procedure");
			String dentist = request.getParameter("Dentist");
			String charged = request.getParameter("AmountCharged");
			String paid = request.getParameter("AmountPaid");
			String balance = request.getParameter("Balance");
			
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
			
	   		PreparedStatement ps = con.prepareStatement("INSERT INTO edc.PxTreatmentRecord(Pxid, treatmentDate, toothNum, proc, dentist, amntCharged, amntPaid, balance) VALUES(?,?,?,?,?,?,?,?) ");
			ps.setString(1, id);
	   		ps.setString(2, date);
			ps.setString(3, tooth);
			ps.setString(4, proc);
			ps.setString(5, dentist);
			ps.setString(6, charged);
			ps.setString(7, paid);
			ps.setString(8, balance);

			int i = ps.executeUpdate();
			if(i > 0) {
				request.setAttribute("status", "success");
			}
			RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
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
