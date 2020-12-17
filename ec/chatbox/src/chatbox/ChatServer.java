package chatbox;
import java.io.*;
import java.net.*;

public class ChatServer {
	public static void main(String[] args){
		boolean flag = true;
		try{
			ServerSocket s = new ServerSocket(77);
			Socket s1 = s.accept();
		
			DataInputStream in = new DataInputStream(s1.getInputStream());  //get msg
			DataOutputStream out = new DataOutputStream(s1.getOutputStream());  //send msg
			PrintStream pw = new PrintStream(out);   //print msg to other comp
			while(flag){
				String str = in.readLine();
				if(str.equals("Quit"))
					flag = false;
				else{
					System.out.println(str);  //print 
					DataInputStream in1 = new DataInputStream(System.in);  //get msg form IO
					String str1 = in1.readLine();
					pw.println(str1);
				}
			}
			
			s.close();
		}catch(Exception e){
			System.out.print("Exception  : "+e);
		}
	}

}
