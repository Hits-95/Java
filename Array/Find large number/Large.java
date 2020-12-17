import java.io.DataInputStream;
public class Large{
	public static void main(String[] args){
		byte sz;
		int arr[],temp;
		try{
			DataInputStream hits = new DataInputStream(System.in);
			System.out.print(" Enter Array Size :- ");
			sz = Byte.parseByte(hits.readLine());
			arr= new int[sz];      //Array initilization....
			//Input Process 
			System.out.println(" Enter "+sz+" number :- ");
			for(int i=0; i < arr.length; i++)
				 i = Integer.parseInt(hits.readLine());
			//Process
			temp=arr[0];
			for(int i : arr)
				if(temp < i)
					temp = i;
			System.out.println(" Your enter array is :- ");
			for(int i : arr)
				System.out.print(" "+i);
			System.out.println(" Large number is :- "+temp);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
