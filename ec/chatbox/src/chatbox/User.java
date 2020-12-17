package chatbox;
import java.io.*;
import java.net.*;
public class User {
	public static void main(String[] args){
		boolean flag = true;
		try{
			Socket s = new Socket("localhost",77);
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			PrintStream pw = new PrintStream(out);
			System.out.println("Enter Msg :: ");
			
			while(flag){
				DataInputStream in1 = new DataInputStream(System.in);
				String str = in1.readLine();				
				if(str.equals("Quit"))
					flag = false;
				else{
					pw.println(str);
					str = in.readLine();
					System.out.println(str);
				}
			}
			
			
		}catch(Exception e){
			System.out.print("Exception   :: "+e);
		}
	}
}

