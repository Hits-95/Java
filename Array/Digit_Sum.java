import java.io.*;

public class Digit_Sum{
	public static void main(String[] args){
    		int sum = 0, d_sum = 0;
			try{
				DataInputStream hit = new DataInputStream(System.in);
				System.out.print(" Enter size of Array :- ");
				int sz = Integer.parseInt(hit.readLine());
				int arr[] = new int[sz];
				System.out.println("Enter "+sz+" Numbers :- ");
				for(int i=0; i<arr.length; i++)
					arr[i] = Integer.parseInt(hit.readLine());
					
				System.out.println("Array Elements are :- ");
				for(int x: arr){
					System.out.print(" "+x);
					sum += x;
				}
				System.out.println("\n Sum Is :- "+sum);
				lab1: while(sum > 0){
					        d_sum += sum % 10;
					        sum /= 10;   
					        if(d_sum > 10){
					    	   sum = d_sum;
					    	   continue lab1;
					        }
				       }
				System.out.println("\n digit Sum Is :- "+d_sum);
			}catch(Exception e){
				System.out.println(e);
			}
	}
}
