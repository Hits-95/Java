import java.io.*;

//Main class
public class EvenOdd{
     public static void main(String[] args){
		 byte num;
		 try{
			 DataInputStream in=new DataInputStream(System.in);
			 System.out.print(" Enter a Number :- ");
			 num=Byte.parseByte(in.readLine());
			 switch(num%2){
				 case 0 :System.out.println(num+" is even.");
				 break;
				 default:System.out.println(num+" is Odd.");
			 }
		 }catch(Exception e){
			 System.out.println(" Error ...");
		 }
	 }
}