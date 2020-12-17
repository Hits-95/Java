import java.util.Scanner;
public class Area_Circle{
	public static void main(String[] args){
		byte r;
		float area;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a Radius :- ");
		r=sc.nextByte();
		area=(float)3.14*r*r;
		System.out.println("Area is :- "+area);
	}

}