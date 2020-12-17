class Super{
	Super(String x){
		System.out.println("Super class Contructer...\n   NAme ="+x);
	}
}
class Sub extends Super{
	Sub(String pass,int m){
		super(pass);
		System.out.println("Sub class Contructer...\n   Number= "+m);
	}
}
public class Para_Cont{
	public static void main(String[] args){
		Sub obj=new Sub("Sakshi.",6);
	}

}