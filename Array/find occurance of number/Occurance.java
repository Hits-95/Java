import java.io.DataInputStream;
public class Occurance{
	public static int  maxFind(int []a){
		int temp = a[0];
		for(int i: a)
			if(temp < i)
				temp = i;
		return(++temp);
	}
	public static void main(String []args){
		byte sz; 
		try{
			DataInputStream in = new DataInputStream(System.in);
			System.out.print(" \n Enter Array size :- ");
			sz = Byte.parseByte(in.readLine());
			int arr[] = new int[sz];
			System.out.println("\n Enter Array :- ");
			for(int i=0; i<arr.length; i++)
				arr[i] = Integer.parseInt(in.readLine());			
			int c[] = new int[ maxFind(arr)];
			for(int i=0;i<arr.length; i++)
				c[arr[i]]++;
			System.out.println("\n Occurance is :-  ");
			for(int i=0; i<c.length; i++)
				if(c[i]>0)
					System.out.println(i+" = "+c[i]);				
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
