import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		byte num;
		float f=1;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("\n Enter a Number :- " );
			num=sc.nextByte();
			while(num>0){
				f=f*num;
				num--;
			}
			System.out.println(" Factorial is :- "+f);
		}catch(Exception e){
			 System.out.println("Error");
		}
	}
}