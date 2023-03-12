

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class MedicalHistoryServlet
 */
@WebServlet("/MedicalHistoryServlet")
public class MedicalHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String dbUrl = "jdbc:mysql://localhost:3306/edc";
	private String dbUname = "root";
	private String dbPassword = ""; //lagay mo dito kung meron password db mo
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
			String id= (String) request.getSession().getAttribute("Pxid");
			String namePhy = request.getParameter("physician-name");
	   		String specialty = request.getParameter("specialty");
	   		String office = request.getParameter("office-address");
	   		String officeNum = request.getParameter("office-number");
	   		String health = request.getParameter("health");
	   		String treatment = request.getParameter("treatment");
	   		String illness = request.getParameter("serious-illness");
	   		String hospitalized = request.getParameter("hospitalized");
	   		String medication = request.getParameter("medication");
	   		String tobacco = request.getParameter("tobacco");
	   		String drug = request.getParameter("drug-use");
	   		String allergies = request.getParameter("allergies[]");
	   		String bleeding = request.getParameter("bleeding-time");
	   		String pregnant = request.getParameter("pregnant");
	   		String nursing = request.getParameter("nursing");
	   		String birthControl = request.getParameter("birth-control");
	   		String blood = request.getParameter("blood-type");
	   		String bloodPressure = request.getParameter("blood-pressure");
	   		String condition = request.getParameter("medical-condition");
	   		
	   		/*
	   		String EncBirth = AES.encrypt(birth);
	   		String EncGender = AES.encrypt(gender);
	   		String EncAddress = AES.encrypt(address);
	   		String EncCellphone = AES.encrypt(cellphone);
	   		String EncEmail = AES.encrypt(email);
	   		String EncOccupation = AES.encrypt(occupation);
	   		String EncGuardian = AES.encrypt(guardian);
	   		*/
	   		
	   		PreparedStatement ps = con.prepareStatement("INSERT INTO edc.MedicalHistory(Pxid, namePhysician, speciality, officeAddr, officeNum, ques1, ques2, ques3, ques4, ques5, ques6, ques7, ques8, ques9, ques10, ques101, ques102, ques11, ques12, ques13) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
	   		ps.setString(1, id);
	   		ps.setString(2, namePhy);
			ps.setString(3, specialty);
			ps.setString(4, office);
			ps.setString(5, officeNum);
			ps.setString(6, health);
			ps.setString(7, treatment);
			ps.setString(8, illness);
			ps.setString(9, hospitalized);
			ps.setString(10, medication);
			ps.setString(11, tobacco);
			ps.setString(12, drug);
			ps.setString(13, allergies);
			ps.setString(14, bleeding);
			ps.setString(15, pregnant);
			ps.setString(16, nursing);
			ps.setString(17, birthControl);
			ps.setString(18, blood);
			ps.setString(19, bloodPressure);
			ps.setString(20, condition);
			
			int i = ps.executeUpdate();
			if(i > 0) {
				request.setAttribute("status", "success");
			}
			RequestDispatcher rd = request.getRequestDispatcher("IntraoralExam.jsp");
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
