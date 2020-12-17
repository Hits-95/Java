import java.io.*;
import java.sql.*;

public class DeleteRecord {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int pno;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver load.");
			
			Connection con = DriverManager.getConnection(url,"system","sakshi");
			System.out.println("Connection establish.\n   --- *** ---");
			
			DataInputStream hit = new DataInputStream(System.in);
			System.out.print("Enter pno to delete : - ");
			pno = Integer.parseInt(hit.readLine());
			
			PreparedStatement s = con.prepareStatement("delete from product where pno = "+pno);
		    s.executeUpdate();
		     System.out.println("Record deleted...");
			con.close();
		}catch(ClassNotFoundException e){
			System.out.println("Driver Not Load. :: "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("Connection Not Establish. :: "+e.getMessage());
		}
		catch(IOException e){
			System.out.println("Input Exception "+e.getMessage());
		}

	}

}
