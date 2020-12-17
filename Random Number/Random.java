import java.util.Random;
public class Random{
	public static void main(String[] args) {
		Random obj = new Random();
		int[] freq = new int[10];
		
		for(int i=0; i<100; i++){
			int x = 1+obj.nextInt(9);
			++freq[x];
		}
	   System.out.println("Nummber \t Frequnce");
	   
	    for(int i=1; i<=10; i++)
		    System.out.println(i+" \t"+freq[i]);
	} 
}