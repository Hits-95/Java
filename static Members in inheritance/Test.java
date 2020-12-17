class Super{
	public int x;
	public static int temp=10;   //can't inherite
	public static void f1(){
		System.out.println(" Static super Class Function...");
	}
}
class Sub extends Super{
	static{
		temp=30;              
	}
	public static void f(){                                    //compulsory make static fun if super cls contant static fun...ow error
		System.out.println(" Static Sub Class Function...");
	}
	public int y;
}
      // Main class... 
public class Test{
	public stati c void main(String[] args){
		Sub.f();
		System.out.println(Sub.temp);    //out put = 30;
	}
==