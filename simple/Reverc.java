import java.util.*;
public class Reverc{
	public static void main(String[] args){
		int num,rev=0;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a Number :- ");
			num=sc.nextInt();
			while(num>0){
				rev*10=rev*10+num%10;
				num/=10;
			}
			 System.out.println(" The Revers Number :- "+rev);
		}
		catch(Exception e){
			 System.out.println("Error");
		}		
	}
}