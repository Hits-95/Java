class Super{
	public void fun1(){
		System.out.println(" Super Class.");
	}
}
class Sub extends Super{
	public void fun1(){
		System.out.println(" Sub class.");
	}
}
public class Over_Wriding{
	public static void main(String[] args) {
		Sub obj=new Sub();
		obj.fun1();         //Sub class

		Sub o=new Super();         //Error
		o.fun1();
	}
}