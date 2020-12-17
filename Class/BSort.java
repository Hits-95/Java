import java.util.Scanner;
public class BSort{
	private
	   byte num,i,j;
	   int[] arr=new int[10];
	   int temp;
	public
	   void Get_data(){
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter value of N = ");
		   num=sc.nextByte();
		   System.out.println("Enter value in array :- ");
		   for(i=0;i<num;i++)
			   arr[i]=sc.nextInt();
		   System.out.println(" Data saved.");
	   }
	   void Put_data(){
		   System.out.println(" The bubble Sort are :- ");
		   for(i=0;i<num;i++)
			   System.out.println(arr[i]);
	   }
	   void B_pro(){
		   for(i=1;i<num;i++)
			   for(j=0;j<num-i;j++)
				   if(arr[j]>arr[j+1]){
					   temp=arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1]=temp;
				   }
	   }
	   public static void main(String[] args){
		   BSort obj=new BSort();
		   obj.Get_data();
		   obj.B_pro();
		   obj.Put_data();
	   }
}