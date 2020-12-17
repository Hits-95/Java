import java.util.Scanner;
public class Simple_Menu{
	public static void main(String args[]){
		try{
			byte ch;
		    int n1,n2;
		    float r=0;
			Scanner sc=new Scanner(System.in);
			System.out.println(" 1. Addition");
			System.out.println(" 2. Subtraction");
			System.out.println(" 3. Multipication");
			System.out.println(" 4. Division");
			System.out.println(" Enter your Choich :- ");
			ch=sc.nextByte();
			System.out.println(" 1. Enter Two Numbers For Calculation :- ");
			n1=sc.nextInt();
			n2=sc.nextInt();
            switch(ch){
				case 1:r=n1+n2;
				       break;
				case 2:r=n1-n2;
				       break;
				case 3:r=n1*n2;
				       break;
			    case 4:r=n1/n2;
				       break;
				default:
				       System.out.println(" Wrong choich...");
			}
            System.out.println(" Result :- "+r);			
		}catch(Exception e){
			System.out.println(" Error...");
		}
	}
}