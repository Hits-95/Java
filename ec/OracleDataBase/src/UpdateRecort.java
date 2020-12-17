import java.io.*;
import java.sql.*;

public class UpdateRecort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int pno1,pno2;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver load.");
			
			Connection con = DriverManager.getConnection(url,"system","sakshi");
			System.out.println("Connection establish.\n   --- *** ---");
			
			DataInputStream hit = new DataInputStream(System.in);
			System.out.print("Enter Product no to be update : - ");
			pno1 = Integer.parseInt(hit.readLine());
			System.out.print("Enter new pno :-  ");
			pno2 = Integer.parseInt(hit.readLine());
			System.out.print("Enter new pname :-  ");
			String pname = hit.readLine();
			System.out.print("Enter new price :-  ");
		    float price = Float.parseFloat(hit.readLine());
			
		    PreparedStatement s = con.prepareStatement("update product set pno = ?,pname = ?,price = ? where pno = "+pno1);
		    s.setInt(1,pno2);
		    s.setString(2,pname);
		    s.setFloat(3,price);
		    s.executeUpdate();
		    con.close();
		    System.out.println("Record Update.");
		}catch(ClassNotFoundException e){
			System.out.println("Exception1 : - "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("Exception2 : - "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Exception : - "+e.getMessage());
		}
	}

}
