import java.util.Random;
public class Random_Examp{
	public static void main(String[] args) {
		Random obj = new Random();
		int[] freq = new int[10];    //indext 0 to 9
		
		for(int i=0; i<100; i++){
			++freq[1+obj.nextInt(9)];          //array 1 to 9
		}
	   System.out.println("Nummber\tFrequnce");
	   
	    for(int i=1; i<10; i++)
		    System.out.println(" "+i+" \t"+freq[i]);
	} 
}