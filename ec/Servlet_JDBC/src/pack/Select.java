package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Select
 */
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			//jdbc connection...
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sakshi");
			
			//get data form select.jsp
			int rollno = Integer.parseInt(request.getParameter("rollno"));
						
			//insert Data into Student table
			PreparedStatement ps = con.prepareStatement("select * from student where rollno = ?");
			
			ps.setInt(1,rollno);
				
			ResultSet rs =ps.executeQuery();
			PrintWriter sak = response.getWriter();
			sak.print("<center  > <h1> Wel - Come </h1></center> ");
			if(rs.next()){
				sak.print("<center><table style = border-style:solid;border-color:orange;width:700px><tr><th>RollNO</th><th>First Name</th><th>Last Name</th><th>Address</th><th>E-mail</th><th>Mobile No</th><th> Coures</th><th>Birth-Date</th></tr>");
				sak.print("<tr><th>"+rs.getInt("rollno")+"</th><th>"+rs.getString("lname")+"</th><th>"+rs.getString("lname")+"</th><th>"+rs.getString("addr")+"</th><th>"+rs.getString("email")+"</th><th>"+rs.getString("mno")+"</th><th> "+rs.getString("course")+"</th><th>"+rs.getString("dob")+"</th></tr></center></table>");
				
			}
			else
				response.sendRedirect("error5.jsp");
			
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
