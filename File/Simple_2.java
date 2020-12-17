import java.io.*;

public class Simple_2{
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("./Simple_2.txt",true);
		
		String str = "Sakshi...";
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<str.length(); ++i)
			fout.write(ch[i]);
		fout.close();
	}
}
