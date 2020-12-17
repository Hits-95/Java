import java.util.*;
public class CAdd{
     public static void main(String[] args){
		 int sum=0;
		 for(byte i=0;i<5;i++)
		      sum+=Integer.parseInt(args[i]);
		 System.out.println("sum = "+sum);
	 }
}