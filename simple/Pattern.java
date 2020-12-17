import java.util.*;
public class Pattern{
	public static void main(String[] args){
		byte ch,a,b;
	    try{
			Scanner sc=new Scanner(System.in);
			System.out.print(" Enter  a Number :- ");
			ch=sc.nextByte();
			for(a=0;a<ch;a++){
				for(b=0;b<=a;b++){
					System.out.print(" *");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}