public class Static_test{
	static int x;
	
	static{
		System.out.println("Hellow...My name is Hitesh. "+x);
	}
	static Static_test(){
		x++;
		System.out.println("value :- "+x);
	}
	public static void main(String []args){
	    new Static_test();
		new Static_test();
	}
}