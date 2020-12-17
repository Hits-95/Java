import java.io.DataInputStream;

class Student{
	int rollno;
	String name;
	void get_Student_Data(){
		try{
			DataInputStream input = new DataInputStream(System.in);
			System.out.print("\t Enter Student Roll No :- ");
			rollno = Integer.parseInt(input.readLine());
			System.out.print("\t Enter Name of Student :- ");
			name = input.readLine();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	void show_Student_Data(){
		System.out.println("\n\t ~~~ Student Information ~~~");
		System.out.println("\n\t Roll No :- "+rollno);
		System.out.println("\n\t Name    :- "+name);
	}
}
class Marks extends Student{
	int eng,math,sci;
	void get_Marks(){
		try{
			DataInputStream input = new DataInputStream(System.in);
			System.out.print("\t Enter English Marks :- ");
			eng = Integer.parseInt(input.readLine());
			System.out.print("\t Enter Math Marks    :- ");
			math = Integer.parseInt(input.readLine());
			System.out.print("\t Enter Science Marks :- ");
			sci = Integer.parseInt(input.readLine());
		}catch(Exception e){
			System.out.println(e);
		}
	}
	void show_Marks(){
		System.out.println("\n\t --- Marks ---");
		System.out.println("\n\t English = "+eng);
		System.out.println("\n\t Math    = "+math);
		System.out.println("\n\t Science = "+sci);
	}
}
class Result extends Marks{
	void show_Result(){
		int total = sci+math+eng;
	    float per = total/3.0f;  
		System.out.println("\n\t Total      = "+total);
        System.out.println("\n\t Persentage = "+per);		
	}
}
public class Student_Result{
	public static void main(String[] args){
		Result obj = new Result();
		obj.get_Student_Data();
		obj.get_Marks();
        obj.show_Student_Data();
        obj.show_Marks();
        obj.show_Result();
	}
}
