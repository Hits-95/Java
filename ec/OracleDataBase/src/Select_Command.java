import java.sql.*;
public class Select_Command {
	public static void main(String[] args) {
		int pno;
		String pname,url =  "jdbc:oracle:thin:@localhost:1521:XE";
		float price;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver load.");
			
			Connection con = DriverManager.getConnection(url,"system","sakshi");
			System.out.println("Connection establish.\n   --- *** ---");
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery("select * from product");
			
			while(rs.next()){
				pno = rs.getInt("pno");
				pname = rs.getString("pname");
				price = rs.getFloat("price");
				
				System.out.println("pno    :- "+pno);
				System.out.println("pname  :- "+pname);
				System.out.println("price  :- "+price+"\n------");
			}
		}catch(SQLException e ){
			System.out.println("driver not load "+e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("connection error...::"+e.getMessage());
		}
	}
}
