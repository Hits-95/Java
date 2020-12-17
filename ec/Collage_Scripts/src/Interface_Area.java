import java.io.*;
interface Area {
	float pi = 3.14f;
	
	abstract float getArea (int r);
}

public class Interface_Area implements Area {
	public float getArea (int r) {
		return(r*r*pi);
	}
	public static void main(String[] args) {
		try{
			DataInputStream hit = new DataInputStream(System.in);
			System.out.print(" \tEnter Radias :- ");
			int r = Integer.parseInt(hit.readLine());
			Interface_Area obj = new Interface_Area();
			Area e;
			e = obj;
			System.out.println(" Area = "+e.getArea(r));
			}catch(Exception e){
			System.out.println(e);
		}

	}

}
