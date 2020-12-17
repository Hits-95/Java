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
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			//jdbc connection...
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sakshi");
			
			//get data form isert.jsp
			int rollno = Integer.parseInt(request.getParameter("rollno"));
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String addr = request.getParameter("addr");
			String email = request.getParameter("email");
			String mno = request.getParameter("mno");
			String course = request.getParameter("course");
			String dob = request.getParameter("dob");		
			
			//send data to wel-come page...
			request.setAttribute("user",fname+" "+lname);    //imp
			
			//insert Data into Student table
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
			ps.setInt(1,rollno);
			ps.setString(2,fname);
			ps.setString(3,lname);
			ps.setString(4,addr);
			ps.setString(5,email);
			ps.setString(6,mno);
			ps.setString(7,course);
			ps.setString(8,dob);
				
			int i = ps.executeUpdate();
			if(i>0)
				request.getRequestDispatcher("welcome1.jsp").forward(request,response);
			else
				response.sendRedirect("error2.jsp");
			
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
