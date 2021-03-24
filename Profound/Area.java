import java.util.Scanner;

public class Area{
    //Triangle
    public int area(int base, int height){
        return base * height * 1 / 2;
    }

    //Rectangle
    public float area(float width, float height){
        return (width * height);
    }
    
    //Square
    public int area(int side){
        return (side * side);
    }

    //circle
    public float area(float radius){
        return (float) 3.14 * radius * radius;
    }

    public static void main(String[] argv){
        Area area = new Area();
        System.out.println("----- Result -----");
        System.out.println("Area of Triangle  : " + area.area(5, 4) );
        System.out.println("Area of Rectangle : " + area.area(2.5f, 5.4f) );
        System.out.println("Area of Squre     : " + area.area(4));
        System.out.println("Area of Circle    : " + area.area(2.5f));
    }
}