

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
 * Servlet implementation class UpdateManageTreatment
 */
public class UpdateManageTreatment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String dbUrl = "jdbc:mysql://localhost:3306/edc";
    private String dbUname = "root";
    private String dbPassword = ""; //lagay mo dito kung meron password db mo
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		String charged = request.getParameter("AmountCharged");
		String paid = request.getParameter("AmountPaid");
		String balance = request.getParameter("Balance");
		RequestDispatcher dispatcher = null;
		
			try {
				String id=request.getParameter("id");
				String treatmentID=request.getParameter("treatmentID");
				Class.forName(dbDriver);
				Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
				PreparedStatement ps = con.prepareStatement("UPDATE edc.PxTreatmentRecord set amntCharged = ?, amntPaid = ?, balance = ? where TreatmentID = ? and Pxid = ? ");
				ps.setString(1, charged);
				ps.setString(2, paid);
				ps.setString(3, balance);
				ps.setString(4, treatmentID);
				ps.setString(5, id);

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


