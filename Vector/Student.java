import java.io.*;
import java.util.*;

class StudentList {
	static int r;
	int roll;
	String name;
	int m1,m2,m3;
	int total;
	float per;
	
	StudentList () {
		roll = (++r);
		System.out.println("\t\t >>> @@@ Enter Student Record @@@ <<< ");
		try {
			BufferedReader hit = new BufferedReader( new InputStreamReader(System.in));
			System.out.print("\t Enter Roll No       :- "+roll);
			System.out.println();
			System.out.print("\t Enter Name          :- ");
			name = hit.readLine();
			System.out.print("\t Enter Science Marks :- ");
			m1 = Integer.parseInt(hit.readLine());
			System.out.print("\t Enter Math Marks    :- ");
			m2 = Integer.parseInt(hit.readLine());
			System.out.print("\t Enter English Marks :- ");
			m3 = Integer.parseInt(hit.readLine());
			//calculate total and persentage.
			total = m1+m2+m3;
			per = total/3f;			
		}catch (Exception e) {
			System.out.println(" Error :- "+e);
		}
	}
	void displayStudent () {
		System.out.println("\t\t >>> @@@ Student Resul @@@ <<<");
		System.out.println("\t Roll No    = "+roll);
		System.out.println("\t Name       = "+name);
		System.out.println("\t Science    = "+m1);
		System.out.println("\t MAth       = "+m2);
		System.out.println("\t English    = "+m3);
		System.out.println("\t Total      = "+total);
		System.out.println("\t persentage = "+per);
		
		if(m1<35 || m2<35 || m3<35)
			System.out.println("\t Result is FAIL.");
		else if (per >= 70)
			System.out.println("\t Distinction.");
		else if(per >= 60)
			System.out.println("\t First Class.");
		else if(per >=50)
			System.out.println("\t Second Class.");
		else if(per >= 50)
			System.out.println("\t Third Class.");
		else
			System.out.println("\t Pass.");
		System.out.println("\t -----------------");
	}
}
//main class
public class Student {
	public static void main(String[] args) {
		Vector v = new Vector();
		StudentList obj;
		try {
			BufferedReader hit = new BufferedReader( new InputStreamReader(System.in));
			System.out.print("\t Enter How Many Record TO Create :- ");
			int n = Integer.parseInt(hit.readLine());
			
			for(int i=0; i<n; ++i){
				obj = new StudentList();
				v.addElement(obj);
			}
			for(int i=0; i<n; ++i){
				obj =  (StudentList) v.elementAt(i);
				obj.displayStudent();
			}
		}catch (Exception e){
			System.out.println("\t Error = "+e);
		}

	}
}
