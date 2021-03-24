import java.util.Scanner;

class Mobile{
    int modelno;
    float price;
    String name;
    String brand;

	public int getModelno() {
		return this.modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
    
    //get Data
    public void getData(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Mobile Brand    :\t");
        this.setBrand(scan.nextLine());
        System.out.print("Enter Mobile Name     :\t");
        this.setName(scan.nextLine());
        System.out.print("Enter Mobile Price    :\t");
        this.setPrice(scan.nextFloat());
        System.out.print("Enter Mobile Model No :\t");
        this.setModelno(scan.nextInt());
       
    }

    public void display(){
        System.out.println("------- Data ---------"); 
        System.out.println("Brand    : " + this.getBrand());
        System.out.println("Name     : " + this.getName());
        System.out.println("Price    : " +this.getPrice());
        System.out.println("Model no : " + this.getModelno());        
    }
}
public class GetSet{
    public static void main(String[] agrv) {
       Mobile mobile = new Mobile();
       mobile.getData();   
       mobile.display();
    }
}