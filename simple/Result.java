import java.util.Scanner;
public class Result{
	public static void main(String[] args){
		byte m1,m2,m3;
		int total;
		float per;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Marks ");
			System.out.println("m1 = ");
			m1=sc.nextByte();
			System.out.println("m2 = ");
			m2=sc.nextByte();
			System.out.println("m3 = ");
			m3=sc.nextByte();
			total=m1+m2+m3;
			per=(float)total/3;
			System.out.println(" Total      :- "+total);
			System.out.println(" Persentage :- "+per);
			if(m1<40||m2<40||m3<40)	
			   System.out.println(" Result is Fail");
		    else if(per>=70)
			        System.out.println(" Distinction");
				 else if(per>=60)
					     System.out.println(" First class");
					  else if(per>=50)
						      System.out.println(" Second class");
						   else
							  System.out.println(" Pass");
				  	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}