package pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process
 */
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		PrintWriter sak = response.getWriter();
		sak.print("<html><body><center><h1>User-Name : <i>"+user+"</i></h1></body></html>");
		sak.print("<html><body><center><h1>Pass-Word : <i>"+pass+"</i></h1></body></html>");

	}

}
