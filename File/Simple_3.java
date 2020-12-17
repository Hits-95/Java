import java.io.FileInputStream;
import java.io.IOException;

public class Simple_3{
	public static void main(String[] args)throws IOException{
		FileInputStream fin = new FileInputStream("./Simple_2.txt");    
		
		int i = fin.read();
		
		do{
			System.out.print((char)i);
			i = fin.read();
		}while(i != -1);		
		
		fin.close();
	}
}
