import java.BufferReader.*;
/**
*Or import java.util.Scanner;
*/
public class Addition{
	public static void main(String[] args){
		int a,b,sum;
		try{
            BufferReader sc = new BufferReader(InputDataSream(System.in));
		  
		   System.out.println("Enter First Number :- ");
		   a=Integer.parseInt(sc.nextInt());
		    //a=Integer.parseInt(br.readLine());
		   System.out.println("Enter Second Number :- ");
		   b=a=Integer.parseInt(sc.nextInt());
		   //b=Integer.parseInt(br.readLine());
		   sum=a+b;
		   System.out.println("Addition of Two Numbers is :- "+sum);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
