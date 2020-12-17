
class A extends Thread{
	public void run(){
		for(int x=0; x<10; ++x)
			System.out.println("x = "+x+" - Class A");
	}
}
class B extends Thread{
	public void run(){
		for(int x=0 ;x<10; ++x)
			System.out.println("x = "+x+" - Class B");
	}
}
public class  Using_Thread_cls{
	public static void main(String[] args){
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.start();
		obj2.start();
	}
}