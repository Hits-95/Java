import pac1.Student;
public class Exam{
	public static void main(String []args){
		Student obj=new Student();
		obj.getRollno(12);
		obj.getName("Hitesh");
		System.out.println("Roll No :- "+obj.showRollno());
        System.out.println("Name    :- "+obj.showName());		
	}
}