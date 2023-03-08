

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
 * Servlet implementation class UpdateIntraOralServlet
 */
@WebServlet("/UpdateOralServlet")
public class UpdateOralServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
		private String dbUrl = "jdbc:mysql://localhost:3306/edc";
		private String dbUname = "root";
		private String dbPassword = ""; //lagay mo dito kung meron password db mo
		private String dbDriver = "com.mysql.cj.jdbc.Driver";
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String StatusRightTopNo55 = request.getParameter("box1");
		String StatusRightTopNo54 = request.getParameter("box2");
		String StatusRightTopNo53 = request.getParameter("box3");
		String StatusRightTopNo52 = request.getParameter("box4");
		String StatusRightTopNo51 = request.getParameter("box5");
		String StatusLeftTopNo61 = request.getParameter("box6");
		String StatusLeftTopNo62 = request.getParameter("box7");
		String StatusLeftTopNo63 = request.getParameter("box8");
		String StatusLeftTopNo64 = request.getParameter("box9");
		String StatusLeftTopNo65 = request.getParameter("box10");
		
		String StatusRightBottomNo55 = request.getParameter("box11");
		String StatusRightBottomNo54 = request.getParameter("box12");
		String StatusRightBottomNo53 = request.getParameter("box13");
		String StatusRightBottomNo52 = request.getParameter("box14");
		String StatusRightBottomNo51 = request.getParameter("box15");
		String StatusLeftBottomNo61 = request.getParameter("box16");
		String StatusLeftBottomNo62 = request.getParameter("box17");
		String StatusLeftBottomNo63 = request.getParameter("box18");
		String StatusLeftBottomNo64 = request.getParameter("box19");
		String StatusLeftBottomNo65 = request.getParameter("box20");
		
		String TopTempRightNo18 = request.getParameter("box21");
		String TopTempRightNo17 = request.getParameter("box22");
		String TopTempRightNo16 = request.getParameter("box23");
		String TopTempRightNo15 = request.getParameter("box24");
		String TopTempRightNo14 = request.getParameter("box25");
		String TopTempRightNo13 = request.getParameter("box26");
		String TopTempRightNo12 = request.getParameter("box27");
		String TopTempRightNo11 = request.getParameter("box28");
		String TopTempLeftNo21 = request.getParameter("box29");
		String TopTempLeftNo22 = request.getParameter("box30");
		String TopTempLeftNo23 = request.getParameter("box31");
		String TopTempLeftNo24 = request.getParameter("box32");
		String TopTempLeftNo25 = request.getParameter("box33");
		String TopTempLeftNo26 = request.getParameter("box34");
		String TopTempLeftNo27 = request.getParameter("box35");
		String TopTempLeftNo28 = request.getParameter("box36");
		
		String TopPermRightNo18 = request.getParameter("box37");
		String TopPermRightNo17 = request.getParameter("box38");
		String TopPermRightNo16 = request.getParameter("box39");
		String TopPermRightNo15 = request.getParameter("box40");
		String TopPermRightNo14 = request.getParameter("box41");
		String TopPermRightNo13 = request.getParameter("box42");
		String TopPermRightNo12 = request.getParameter("box43");
		String TopPermRightNo11 = request.getParameter("box44");
		String TopPermLeftNo21 = request.getParameter("box45");
		String TopPermLeftNo22 = request.getParameter("box46");
		String TopPermLeftNo23 = request.getParameter("box47");
		String TopPermLeftNo24 = request.getParameter("box48");
		String TopPermLeftNo25 = request.getParameter("box49");
		String TopPermLeftNo26 = request.getParameter("box50");
		String TopPermLeftNo27 = request.getParameter("box51");
		String TopPermLeftNo28 = request.getParameter("box52");
		
		String BottomPermRightNo48 = request.getParameter("box53");
		String BottomPermRightNo47 = request.getParameter("box54");
		String BottomPermRightNo46 = request.getParameter("box55");
		String BottomPermRightNo45 = request.getParameter("box56");
		String BottomPermRightNo44 = request.getParameter("box57");
		String BottomPermRightNo43 = request.getParameter("box58");
		String BottomPermRightNo42 = request.getParameter("box59");
		String BottomPermRightNo41 = request.getParameter("box60");
		String BottomPermLeftNo31 = request.getParameter("box61");
		String BottomPermLeftNo32 = request.getParameter("box62");
		String BottomPermLeftNo33 = request.getParameter("box63");
		String BottomPermLeftNo34 = request.getParameter("box64");
		String BottomPermLeftNo35 = request.getParameter("box65");
		String BottomPermLeftNo36 = request.getParameter("box66");
		String BottomPermLeftNo37 = request.getParameter("box67");
		String BottomPermLeftNo38 = request.getParameter("box68");
		
		String BottomTempRightNo48 = request.getParameter("box69");
		String BottomTempRightNo47 = request.getParameter("box70");
		String BottomTempRightNo46 = request.getParameter("box71");
		String BottomTempRightNo45 = request.getParameter("box72");
		String BottomTempRightNo44 = request.getParameter("box73");
		String BottomTempRightNo43 = request.getParameter("box74");
		String BottomTempRightNo42 = request.getParameter("box75");
		String BottomTempRightNo41 = request.getParameter("box76");
		String BottomTempLeftNo31 = request.getParameter("box77");
		String BottomTempLeftNo32 = request.getParameter("box78");
		String BottomTempLeftNo33 = request.getParameter("box79");
		String BottomTempLeftNo34 = request.getParameter("box80");
		String BottomTempLeftNo35 = request.getParameter("box81");
		String BottomTempLeftNo36 = request.getParameter("box82");
		String BottomTempLeftNo37 = request.getParameter("box83");
		String BottomTempLeftNo38 = request.getParameter("box84");
	
		String StatusRightTopNo85 = request.getParameter("box85");
		String StatusRightTopNo84 = request.getParameter("box86");
		String StatusRightTopNo83 = request.getParameter("box87");
		String StatusRightTopNo82 = request.getParameter("box88");
		String StatusRightTopNo81 = request.getParameter("box89");
		String StatusLeftTopNo71 = request.getParameter("box90");
		String StatusLeftTopNo72 = request.getParameter("box91");
		String StatusLeftTopNo73 = request.getParameter("box92");
		String StatusLeftTopNo74 = request.getParameter("box93");
		String StatusLeftTopNo75 = request.getParameter("box94");
		
		String StatusRightBottomNo85 = request.getParameter("box95");
		String StatusRightBottomNo84 = request.getParameter("box96");
		String StatusRightBottomNo83 = request.getParameter("box97");
		String StatusRightBottomNo82 = request.getParameter("box98");
		String StatusRightBottomNo81 = request.getParameter("box99");
		String StatusLeftBottomNo71 = request.getParameter("box100");
		String StatusLeftBottomNo72 = request.getParameter("box101");
		String StatusLeftBottomNo73 = request.getParameter("box102");
		String StatusLeftBottomNo74 = request.getParameter("box103");
		String StatusLeftBottomNo75 = request.getParameter("box104");
		
		String notes = request.getParameter("note");
		RequestDispatcher dispatcher = null;
		
		try {
			String id= request.getParameter("id");
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, dbUname,dbPassword);
			
			
			PreparedStatement ps = con.prepareStatement("UPDATE edc.IntraOral set TopToothNo_55 = ?, TopToothNo_54 = ?, TopToothNo_53 = ?, TopToothNo_52 = ?, TopToothNo_51 = ?, TopToothNo_61 = ?, TopToothNo_62 = ?, TopToothNo_63 = ?, TopToothNo_64 = ?, TopToothNo_65 = ?, BottomToothNo_55 = ?, BottomToothNo_54 = ?, BottomToothNo_53 = ?, BottomToothNo_52 = ?, BottomToothNo_51 = ?, BottomToothNo_61 = ?, BottomToothNo_62 = ?, BottomToothNo_63 = ?, BottomToothNo_64 = ?, BottomToothNo_65 = ?, TopToothNo_18 = ?, TopToothNo_17 = ?, TopToothNo_16 = ?, TopToothNo_15 = ?, TopToothNo_14 = ?, TopToothNo_13 = ?, TopToothNo_12 = ?, TopToothNo_11 = ?, TopToothNo_21 = ?, TopToothNo_22 = ?, TopToothNo_23 = ?, TopToothNo_24 = ?, TopToothNo_25 = ?, TopToothNo_26 = ?, TopToothNo_27 = ?, TopToothNo_28 = ?, BottomToothNo_18 = ?, BottomToothNo_17 = ?, BottomToothNo_16 = ?, BottomToothNo_15 = ?, BottomToothNo_14 = ?, BottomToothNo_13 = ?, BottomToothNo_12 = ?, BottomToothNo_11 = ?, BottomToothNo_21 = ?, BottomToothNo_22 = ?, BottomToothNo_23 = ?, BottomToothNo_24 = ?, BottomToothNo_25 = ?, BottomToothNo_26 = ?, BottomToothNo_27 = ?, BottomToothNo_28 = ?, TopToothNo_48 = ?, TopToothNo_47 = ?, TopToothNo_46 = ?, TopToothNo_45 = ?, TopToothNo_44 = ?, TopToothNo_43 = ?, TopToothNo_42 = ?, TopToothNo_41 = ?, TopToothNo_31 = ?, TopToothNo_32 = ?, TopToothNo_33 = ?, TopToothNo_34 = ?, TopToothNo_35 = ?, TopToothNo_36 = ?, TopToothNo_37 = ?, TopToothNo_38 = ?, BottomToothNo_48 = ?, BottomToothNo_47 = ?, BottomToothNo_46 = ?, BottomToothNo_45 = ?, BottomToothNo_44 = ?, BottomToothNo_43 = ?, BottomToothNo_42 = ?, BottomToothNo_41 = ?, BottomToothNo_31 = ?, BottomToothNo_32 = ?, BottomToothNo_33 = ?, BottomToothNo_34 = ?, BottomToothNo_35 = ?, BottomToothNo_36 = ?, BottomToothNo_37 = ?, BottomToothNo_38 = ?, TopToothNo_85 = ?, TopToothNo_84 = ?, TopToothNo_83 = ?, TopToothNo_82 = ?, TopToothNo_81 = ?, TopToothNo_71 = ?, TopToothNo_72 = ?, TopToothNo_73 = ?, TopToothNo_74 = ?, TopToothNo_75 = ?, BottomToothNo_85 = ?, BottomToothNo_84 = ?, BottomToothNo_83 = ?, BottomToothNo_82 = ?, BottomToothNo_81 = ?, BottomToothNo_71 = ?, BottomToothNo_72 = ?, BottomToothNo_73 = ?, BottomToothNo_74 = ?, BottomToothNo_75 = ?, notes = ? WHERE Pxid = ? ");
	   		ps.setString(1, StatusRightTopNo55);
			ps.setString(2, StatusRightTopNo54);
			ps.setString(3, StatusRightTopNo53);
			ps.setString(4, StatusRightTopNo52);
			ps.setString(5, StatusRightTopNo51);
			ps.setString(6, StatusLeftTopNo61);
			ps.setString(7, StatusLeftTopNo62);
			ps.setString(8, StatusLeftTopNo63);
			ps.setString(9, StatusLeftTopNo64);
			ps.setString(10, StatusLeftTopNo65);
			ps.setString(11, StatusRightBottomNo55);
			ps.setString(12, StatusRightBottomNo54);
			ps.setString(13, StatusRightBottomNo53);
			ps.setString(14, StatusRightBottomNo52);
			ps.setString(15, StatusRightBottomNo51);
			ps.setString(16, StatusLeftBottomNo61);
			ps.setString(17, StatusLeftBottomNo62);
			ps.setString(18, StatusLeftBottomNo63);
			ps.setString(19, StatusLeftBottomNo64);
			ps.setString(20, StatusLeftBottomNo65);
			
	   		ps.setString(21, TopTempRightNo18);
			ps.setString(22, TopTempRightNo17);
			ps.setString(23, TopTempRightNo16);
			ps.setString(24, TopTempRightNo15);
			ps.setString(25, TopTempRightNo14);
			ps.setString(26, TopTempRightNo13);
			ps.setString(27, TopTempRightNo12);
			ps.setString(28, TopTempRightNo11);
			ps.setString(29, TopTempLeftNo21);
			ps.setString(30, TopTempLeftNo22);
			ps.setString(31, TopTempLeftNo23);
			ps.setString(32, TopTempLeftNo24);
			ps.setString(33, TopTempLeftNo25);
			ps.setString(34, TopTempLeftNo26);
			ps.setString(35, TopTempLeftNo27);
			ps.setString(36, TopTempLeftNo28);
			
			ps.setString(37, TopPermRightNo18);
			ps.setString(38, TopPermRightNo17);
			ps.setString(39, TopPermRightNo16);
			ps.setString(40, TopPermRightNo15);
	   		ps.setString(41, TopPermRightNo14);
			ps.setString(42, TopPermRightNo13);
			ps.setString(43, TopPermRightNo12);
			ps.setString(44, TopPermRightNo11);
			ps.setString(45, TopPermLeftNo21);
			ps.setString(46, TopPermLeftNo22);
			ps.setString(47, TopPermLeftNo23);
			ps.setString(48, TopPermLeftNo24);
			ps.setString(49, TopPermLeftNo25);
			ps.setString(50, TopPermLeftNo26);
			ps.setString(51, TopPermLeftNo27);
			ps.setString(52, TopPermLeftNo28);
			
			ps.setString(53, BottomPermRightNo48);
			ps.setString(54, BottomPermRightNo47);
			ps.setString(55, BottomPermRightNo46);
			ps.setString(56, BottomPermRightNo45);
			ps.setString(57, BottomPermRightNo44);
			ps.setString(58, BottomPermRightNo43);
			ps.setString(59, BottomPermRightNo42);
			ps.setString(60, BottomPermRightNo41);
	   		ps.setString(61, BottomPermLeftNo31);
			ps.setString(62, BottomPermLeftNo32);
			ps.setString(63, BottomPermLeftNo33);
			ps.setString(64, BottomPermLeftNo34);
			ps.setString(65, BottomPermLeftNo35);
			ps.setString(66, BottomPermLeftNo36);
			ps.setString(67, BottomPermLeftNo37);
			ps.setString(68, BottomPermLeftNo38);
			
			ps.setString(69, BottomTempRightNo48);
			ps.setString(70, BottomTempRightNo47);
			ps.setString(71, BottomTempRightNo46);
			ps.setString(72, BottomTempRightNo45);
			ps.setString(73, BottomTempRightNo44);
			ps.setString(74, BottomTempRightNo43);
			ps.setString(75, BottomTempRightNo42);
			ps.setString(76, BottomTempRightNo41);
			ps.setString(77, BottomTempLeftNo31);
			ps.setString(78, BottomTempLeftNo32);
			ps.setString(79, BottomTempLeftNo33);
			ps.setString(80, BottomTempLeftNo34);
	   		ps.setString(81, BottomTempLeftNo35);
			ps.setString(82, BottomTempLeftNo36);
			ps.setString(83, BottomTempLeftNo37);
			ps.setString(84, BottomTempLeftNo38);
			
			ps.setString(85, StatusRightTopNo85);
			ps.setString(86, StatusRightTopNo84);
			ps.setString(87, StatusRightTopNo83);
			ps.setString(88, StatusRightTopNo82);
			ps.setString(89, StatusRightTopNo81);
			ps.setString(90, StatusLeftTopNo71);
			ps.setString(91, StatusLeftTopNo72);
			ps.setString(92, StatusLeftTopNo73);
			ps.setString(93, StatusLeftTopNo74);
			ps.setString(94, StatusLeftTopNo75);
			
			ps.setString(95, StatusRightBottomNo85);
			ps.setString(96, StatusRightBottomNo84);
			ps.setString(97, StatusRightBottomNo83);
			ps.setString(98, StatusRightBottomNo82);
			ps.setString(99, StatusRightBottomNo81);
			ps.setString(100, StatusLeftBottomNo71);
			ps.setString(101, StatusLeftBottomNo72);
			ps.setString(102, StatusLeftBottomNo73);
			ps.setString(103, StatusLeftBottomNo74);
			ps.setString(104, StatusLeftBottomNo75);
			ps.setString(105, notes);
			ps.setString(106, id);
			
			System.out.print(id);
			
			int i = ps.executeUpdate();
			if(i > 0) {
				request.setAttribute("status", "success");
			}
			RequestDispatcher rd = request.getRequestDispatcher("HOME_homepg.jsp");
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
