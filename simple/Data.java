import java.io.DataInputStream;
public class Data {
    public static void main(String[] args){
        try{
            int a,b,c;
            DataInputStream obj=new DataInputStream(System.in);
            System.out.print(" Enter First Number  :- ");
            a=Integer.parseInt(obj.readLine());
            System.out.print(" Enter second Number :- ");
            b=Integer.parseInt(obj.readLine());
            c=a+b;
            System.out.println(" The Addition is = "+c);
        }catch(Exception e){
            System.out.println(" Error...");
        }
    }
}
