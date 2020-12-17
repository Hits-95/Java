import java.io.File;
import java.io.IOException;

class Simple_1{
	public static void main(String[] args)throws IOException{
		File f1 = new File("./Simple_1.txt");                 /* ../File/Simple_1.txt  */
		
		f1.createNewFile();
		System.out.println("can file read : "+f1.canRead());
		System.out.println("can file write: "+f1.canWrite());
		System.out.println("file name : "+f1.getName());
		System.out.println("is file exite : "+f1.exists());
		System.out.println("file length : "+f1.length());
		
	}
}