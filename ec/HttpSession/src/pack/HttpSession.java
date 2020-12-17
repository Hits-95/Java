package pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("user");
		
		javax.servlet.http.HttpSession s = request.getSession();   //IMP line problem with PACK 
		s.setAttribute("user",name);
		
		response.sendRedirect("welcome.jsp");
		
	}

}
