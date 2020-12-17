/**
 * SET B(1)
*/

import java.io.*;

abstract class Staff{
	public String name,addr;
	Staff(){
		/*
		 * It make Bcoz,while creating constructer in sub class the super class,
		 *  always have constructer which  is in sub class
		 */
	}
	
	Staff(String name,String addr){
		this.name = name;
		this.addr = addr;
	}	
	abstract void showStaffInfo();
}

class FullTimeStaff extends Staff{
	String dept;
	double salary;
	
	FullTimeStaff(){
		try{
			BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\t Enter Department :- ");
			dept = hit.readLine();
			System.out.print("\t Enter Salary      :- ");
			salary = Double.parseDouble(hit.readLine());
			System.out.println("\t---------");
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	FullTimeStaff(String name,String addr){
		super(name,addr);
	}
	void showStaffInfo(){
		System.out.println("\t Name       = "+name);
		System.out.println("\t Address    = "+addr);
		System.out.println("\t Department = "+dept);
		System.out.println("\t Salary     = "+salary);
		System.out.println("\t---------_");
	}
	
}

class PartTimeStaff extends Staff{
	byte number_of_houre;
	double rate_per_houre;
	
	PartTimeStaff(){
		try{
			BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\t Enter Number of Houres :- ");
			number_of_houre = Byte.parseByte(hit.readLine());
			System.out.print("\t Enter Rate per Houre   :- ");
			rate_per_houre = Double.parseDouble(hit.readLine());
			System.out.println("\t---------_");
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	PartTimeStaff(String name,String addr){
		super(name,addr);
	}
	
	void showStaffInfo(){
		System.out.println("\t Name             = "+name);
		System.out.println("\t Address          = "+addr);
		System.out.println("\t Number Of Houres = "+number_of_houre);
		System.out.println("\t Rate Per Houres  = "+rate_per_houre);
		System.out.println("\t ---------");
	}	
}

public class TimeStaff_3 {	
	 static String name,addr;
	
	public static void getStaffInfo(FullTimeStaff[] ar){
		try{
			BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
	    	for(int i=0; i<ar.length; i++){
	    		System.out.print("\t Enter Name    :- ");
	    		name = hit.readLine();
	    		System.out.print("\t Enter Address :- ");
	    		addr = hit.readLine();
	    		ar[i] = new FullTimeStaff(name,addr);
	    		ar[i] = new FullTimeStaff();
	    	}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void getStaffInfo(PartTimeStaff[] ar){
		try{
			BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
	    	for(int i=0; i<ar.length; i++){
	    		System.out.print("\t Enter Name    :- ");
	    		name = hit.readLine();
	    		System.out.print("\t Enter Address :- ");
	    		addr = hit.readLine();
	    		ar[i] = new PartTimeStaff(name,addr);
	    		ar[i] = new PartTimeStaff();
	    	}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		byte size_staff;
	    byte ch;
	    
	    try{
	    	BufferedReader hit = new BufferedReader(new InputStreamReader(System.in));
	    	System.out.println("\t 1. Create Full Time Staff List.");
		    System.out.println("\t 2. Create Part Time Staff List.");
		    System.out.print("\t Enter Your Choich :- ");
		    ch = Byte.parseByte(hit.readLine());
		    System.out.print("\t Enter Size Of Staff :- ");
		   	size_staff = Byte.parseByte(hit.readLine());    	    
		    
		    switch(ch){
		    case 1 : System.out.println("\t\t~~~ >>> Full Time Staff <<< ~~~");
		    	     FullTimeStaff[] fobj = new FullTimeStaff[size_staff];
		    	     getStaffInfo(fobj);
		    	     System.out.println("\t\t~~~ >>> Full Time Staff Information<<< ~~~");
		    	     for(int i=0; i<fobj.length; ++i)
		    	    	 fobj[i].showStaffInfo();
		             break;
		    case 2 : System.out.println("\t\t~~~ >>> Part Time Staff <<< ~~~");
		             PartTimeStaff[] pobj = new PartTimeStaff[size_staff];
		             getStaffInfo(pobj);
		             System.out.println("\t\t~~~ >>> Full Time Staff Information <<< ~~~");
		    	     for(int i=0; i<pobj.length; ++i)
		    	    	 pobj[i].showStaffInfo();
                     break;
		    }
		}
		catch(Exception e){
			System.out.print(e);
		}
	    
	}

}
