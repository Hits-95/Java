package Series;

public class Prime {
	int flage =0;
	public void isPrime(int num){
		for(int i=2; i<num; i++)
			if(num%i == 0)
				flage++;
		
			if(flage == 0)
				System.out.println("\t Number "+num+" is PRIME.");
			else
				System.out.println("\t Number "+num+" is NOT PRIME.");
	}
}