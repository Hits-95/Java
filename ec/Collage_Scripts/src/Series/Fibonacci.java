package Series;
import java.io.*;
public class Fibonacci {
	double start,next,end,temp;
	public void getFibonacci(){
		try{
			BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\t Enter Start number :- ");
			start = Integer.parseInt(hit.readLine());
			System.out.print("\t Enter End   number :- ");
			end = Integer.parseInt(hit.readLine());
			System.out.println("\n\t ");
			temp = 1+start;
			for(int i=0; i<end; ++i){
				System.out.print(" "+start);
				next= start+temp;
				start = temp;
				temp = next;
				
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}