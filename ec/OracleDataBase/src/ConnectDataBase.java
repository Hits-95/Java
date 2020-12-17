import java.sql.*;
import java.io.*;

public class ConnectDataBase {
	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		int pno;
		float price;
		String pname;
		
		try {
			//Oracale Database connection ...
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded...");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sakshi");
			System.out.println("Connection establish.\n   --- *** ---");
			
			DataInputStream hit = new DataInputStream(System.in);
			System.out.print("Enter product no    : - ");
			pno = Integer.parseInt(hit.readLine());
			System.out.print("Enter product name  : - ");
			pname = hit.readLine();
			System.out.print("Enter product price : - ");
			price = Float.parseFloat(hit.readLine());
			
			PreparedStatement s = con.prepareStatement("insert into product values(?,?,?)");
			s.setInt(1,pno);
			s.setString(2,pname);
			s.setFloat(3,price);
			s.executeUpdate();   //Imp
			
			System.out.println("Record saved.");
			con.close();			
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
