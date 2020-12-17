
class A implements Runnable{
	public void run(){
		for(int x=0; x<10; ++x)
			System.out.println("x = "+x+" - Class A");
	}
}
class B implements Runnable{
	public void run(){
		for(int x=0 ;x<10; ++x)
			System.out.println("x = "+x+" - Class B");
	}
}
public class  Using_Runnable_Interface{
	public static void main(String[] args){
		//Thread t1 = new Thread(new A());
		//Thread t2 = new Thread(new B());
		
		new Thread(new A()).start();
		new Thread(new B()).start();
	}
}