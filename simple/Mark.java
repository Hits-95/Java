import java.util.Scanner;
public class Mark{
	public static void main(String[] args){
		byte m1,m2,m3;
		float total,per;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st Subject Mark :- ");
			m1=sc.nextByte();
			System.out.println("Enter 2nd Subject Mark :- ");
			m2=sc.nextByte();
			System.out.println("Enter 3rd Subject Mark :- ");
			m3=sc.nextByte();
			total=(float)m1+m2+m3;
			per=total/3;
			System.out.println("Total      :- "+total);
			System.out.println("Persentage :- "+per);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}