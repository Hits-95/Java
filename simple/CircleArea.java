import java.io.*;

//Main class
public class CircleArea{
	 static float r;
	
	//Get data from user
	 static void getData(){
		try{
			DataInputStream in=new DataInputStream(System.in);
			System.out.print(" Enter a Radius :- " );
			r=Float.parseFloat(in.readLine());			
		}catch(Exception e){
			System.out.println(" Error...");
		}
	}
	
	//Dispaly Result
	static void dispalyResult(){
			System.out.println(" Area of circle is = "+	(float)3.14*r*r);
	}
	
	//main method
	public static void main(String[] args){ 
		getData();
		dispalyResult();
	}
}