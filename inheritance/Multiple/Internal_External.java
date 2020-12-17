import java.io.DataInputStrean;

class Studen{
	int rollno;
	String name;
	void get_Student(){
		try{
			DataInputStream input = new DataInputStream(System.in);
			System.out.print("\t Enter Roll No :- ");
			rollno = Integer.parseInt(input.readLine());
			System.out.print("\t Enter Name    :- ");
			name = input.readLine();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	void show_Student(){
		System.out.println("\n\t ~~~ Student Infornamtion ~~~");
	    System.out.println("\n\t Roll No = "+rollno);
		System.out.println("\n\t Name    = "+name);
	}
}
class Internal_Mark extends Student{
	int eng,math,sci;
    int get_Internal(){
		try{
			System.out.println("\n\t ^^^_Input Internal Marks_^^^ ");
		    System.out.print("\n\t English = ");
		    eng = Integer.parseInt(readLine());
	        System.out.print("\n\t Math    = ");
		    math = Integer.parseInt(readLine());
	        System.out.print("\n\t Science = ");
		    sci = Integer.parseInt(readLine());
			return(sci+math+eng);
		}catch(Exception e){
			System.out.println(e);
		}
	}	
	void show_Internal(){
		System.out.println("\n\t --- Internal Marks ---");
		System.out.println("\n\t English = "+eng);
		System.out.println("\n\t Math    = "+math);
		System.out.println("\n\t Science = "+sci);
	}
}
class External_Mark extends Student{
	int eng,math,sci;
    int get_External(){
		try{
			System.out.println("\n\t ^^^_Input Eternal Marks_^^^ ");
		    System.out.print("\n\t English = ");
		    eng = Integer.parseInt(readLine());
	        System.out.print("\n\t Math    = ");
		    math = Integer.parseInt(readLine());
	        System.out.print("\n\t Science = ");
		    sci = Integer.parseInt(readLine());
			return(sci+math+eng);
		}catch(Exception e){
			System.out.println(e);
		}
	}	
	void show_External(){
		System.out.println("\n\t --- External Marks ---");
		System.out.println("\n\t English = "+eng);
		System.out.println("\n\t Math    = "+math);
		System.out.println("\n\t Science = "+sci);
	}
}
public class Result{
	Internal_Mark io = new Internal_Mark();
	External_Mark eo = new External_Mark();
    public static void get_Result(){
		int total;
		float per;
		io.get_Student();
		totol = io.get_Internal() + eo.get_External();
		io.show_Student();
		io.show_Internal();
		eo.show_External():
		System.out.println("\n\t Total      = "+total);
		System.out.println("\n\t Persentage = "+per);
	}
	public static void main(String[] args){
		get_Result();
	}
}
