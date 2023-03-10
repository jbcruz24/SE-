

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Date;

/**
 * Servlet implementation class SignUpVerOTP
 */
public class SignUpVerOTP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Date now = new Date();
	long current = this.now.getTime();
	private static final long otpDur = 180000;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int value=Integer.parseInt(request.getParameter("OTP"));
		HttpSession session=request.getSession();
		int otp=(int)session.getAttribute("otp");
		long curr = (long)session.getAttribute("Current");
		long duration = curr + otpDur;
		
		
		
		RequestDispatcher dispatcher=null;
		
		
		if (value==otp && duration > current) 
		{
			
				request.setAttribute("email", request.getParameter("email"));
				request.setAttribute("status", "success");
			  dispatcher=request.getRequestDispatcher("SignUp.jsp");
			dispatcher.forward(request, response);
			
		}
		else
		{
			response.sendRedirect("SignUpVerOTP.jsp?msg=wrong");
		}
		
	}

}
