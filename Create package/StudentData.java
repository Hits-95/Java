package student;
import java.io.*;

public class StudentData{
	int roll;
	String name;
	String add;
	
	public void getStudentData(){
		try{
			BufferedReader hit = new BufferedReader( new DateStreamReader(System.in));
			System.out.print("\t Enter roll Number :- ");
			roll = Integer.parseInt(hit.readLine());
			System.out.print("\t Enter roll Number :- ");
			roll = Integer.parseInt(hit.readLine());
			System.out.print("\t Enter roll Number :- ");
			roll = Integer.parseInt(hit.readLine());
		}catch(Exception e){
			System.out.println("\t Error "+e);
		}
	}
}