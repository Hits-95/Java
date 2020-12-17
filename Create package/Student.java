package pac1;
//Main class
public class Student{
	//Variables
	private int roll;
	private String name;
	//Functions
	public void getRollno(int r){
		roll=r;
	}
	public void getName(String s){
		name=s;
	}
	public int showRollno(){
		return(roll);
	}
	public String showName(){
		return(name);
	}	
}