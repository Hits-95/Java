import sakshi.salary;
import java.io.*;
public class Basic_Salary{
	public static void main(String []args){
		float sal;
		try{
			salary obj=new salary();
			DataInputStream in=new DataInputStream(System.in);
			System.out.print("\n\t Enter Basic Salary :- ");
			sal=Float.parseFloat(in.readLine());
			obj.getBasicSalary(sal);
			obj.showBasicSalary();
			obj.calDa();
			obj.calHra();
			obj.calGross();
			obj.calPf();
			obj.calNet();
		}catch(Exception e){
			System.out.print("\t Error...");
			
		}
	}
}