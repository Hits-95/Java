import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		try{
			byte num,check=0,mul=2;
			Scanner sc=new Scanner(System.in);
			System.out.println("\n ---Wel Come ---- \n");
			System.out.print(" Enter a Number :- ");
			num=sc.nextByte();
			if(num==1||num==2)
				System.out.println("The Number is Prime :- "+num);
			else{
				while(mul<num){
					if(num%mul==0)
						check++;
					mul++;
				}
				if(check==0)
				    System.out.println("\n The Number is Prime  :- "+num);
			    else
				   System.out.println("\n The Number Not Prime :- "+num);
			}
			
			
		}catch(Exception e){
			System.out.println(" Error");
		}
	}
	
}