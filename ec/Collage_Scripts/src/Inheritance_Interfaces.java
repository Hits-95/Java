/*
 * SET A
 */
import java.io.*;

class Employee{
	private int id;
	private String name,department;
	private double salary;
	   
	  public void display_Employee(){
		   System.out.println("\t\t ~~~ >>>  EMPLOYEE INFORMATION  <<< ~~~ ");
		   System.out.println("t ID         = "+id);
		   System.out.println("t Name       = "+name);
		   System.out.println("t Department = " +department);
		   System.out.println("t Salary     = "+salary);
		   
	   }
	   Employee(int id, String name, String department, double salary){
		   this.id = id;
		   this.name = name;
		   this.department = department;
		   this.salary = salary;
	   }
}

class Manager extends Employee{
	private double bonus;		
		
	Manager(int id,String name, String dept, double sal, double bonus){
		super(id,name,dept,sal); 
		this.bonus = bonus;
	}
}

public class Inheritance_Interfaces {
	public static void main(String[] args){
		try{
			BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\t Enter Size :- ");
            int sz = Integer.parseInt(hit.readLine());
			
            Manager[] obj = new Manager[sz];
			int id = 0;
			String name,dept;
			double bon,sal;

			for(int i=0; i<obj.length; ++i){
				System.out.print("\t Enter ID         :- ");
				id = Integer.parseInt(hit.readLine());
				System.out.print("\t Enter Name       :- ");
				name = hit.readLine();
				System.out.print("\t Enter Department :- ");
				dept = hit.readLine();
				System.out.print("\t Enter Salary     :- ");
				sal = Double.parseDouble(hit.readLine());
				System.out.print("\t Enter Bonus      :- ");
				bon= Double.parseDouble(hit.readLine());
				
				obj[i] = new Manager(id,name,dept,sal,bon);
				obj[i].display_Employee();
		    }
		}catch(Exception E){
			System.out.println(E);
	    }
    }	
}
