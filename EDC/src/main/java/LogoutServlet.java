

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		
		String requestURL = request.getHeader("referer");
		String requestFileNameReversed = "";
		for(int i=requestURL.length()-1; requestURL.charAt(i) != '/'; i--) {
			requestFileNameReversed += requestURL.charAt(i);
		}
		
		String requestFileName = "";
		for(int i=requestFileNameReversed.length()-1; i>=0; i--) {
			requestFileName += requestFileNameReversed.charAt(i);
		}
		
		if(requestFileName.equals("HOME_homepg.jsp")) {
			response.sendRedirect("login.jsp");
		} 
	}
}