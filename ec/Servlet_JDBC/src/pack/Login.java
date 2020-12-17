package pack;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			//jdbc connection...
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sakshi");
		
			String username = request.getParameter("user");
			String pass = request.getParameter("pass");
			
			//send data to wel-come page...
			request.setAttribute("user",username);    //imp
			
			//insert Data into User Table
			PreparedStatement ps = con.prepareStatement("select * from usertable where username=? and pass=?");
			ps.setString(1,username);
			ps.setString(2,pass);
			
			ResultSet rs =ps.executeQuery();
						
			if(rs.next())
				request.getRequestDispatcher("Opration.jsp").forward(request,response);
			else
				response.sendRedirect("error1.jsp");
			
		}catch(IOException e){
			System.out.println(e);
		}
		catch(ClassNotFoundException e){
			System.out.println("Driver not load...");
		}
		catch(SQLException e){
			System.out.println("Connection not establis...");
			
		}
		
		
	}

}
