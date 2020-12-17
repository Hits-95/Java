import java.io.*;
class Product_Info{
	int qt;
	float rate;
	String name;
	void getData(){
		try{
			DataInputStream in = new DataInputStream(System.in);
			System.out.print(" \n\n Enter Product Name    :- ");
			name=in.readLine();
			System.out.print(" Enter Quntity         :- ");
			qt=Integer.parseInt(in.readLine());
			System.out.print(" Enter Rate Of Product :- ");
			rate=Float.parseFloat(in.readLine());
		}catch(Exception e){
			System.out.println("Error...");
		}
	}
}
class Bill extends Product_Info{
	float amt;
	public void showBill(){
		amt=(float)qt*rate;

		System.out.println("\n Product Name    :- "+name);
		System.out.println(" Product Price   :- "+rate);
		System.out.println(" Product Quntity :- "+rate);
		System.out.println("\n ----~~~ Bill~~~----");
		System.out.println(" Ammount  = "+amt);
		System.out.println(" Discount = "+amt*0.1f);
	}
}
public class Produc{
	public static void main(String[] args) {
		Bill obj = new Bill();
		obj.getData();
		obj.showBill();
	}
}