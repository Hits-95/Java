import java.io.*;

public class RowCol_Sum{
	public static void main(String[] args){
		try{
			BufferedReader hit = new BufferedReader( new InputStreamReader(System.in));
			int row,col;
			System.out.print("Enter Row Size :- ");
			row = Integer.parseInt(hit.readLine());
			System.out.print("Enter Col size :- ");
			col = Integer.parseInt(hit.readLine());
			//Araay Declaration and Initiization
			int[] a[] = new int [row][col];
			int[][] sum = new int[row+1][col+1]; 

			System.out.println("Enter Array "+row+" by "+col+" :- ");
			for(int i=0; i<row; i++)
				for(int j=0; j<col; j++)
					a[i][j] = Integer.parseInt(hit.readLine());
				
		    System.out.println(" Array "+row+" by "+col+" is :- ");
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
				    System.out.print(" "+a[i][j]);
				    sum[i][j] = a[i][j];
				}
				System.out.println();
			}
			
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
				    sum[i][col] += a[i][j];
					sum[row][j] += a[i][j];
					sum[row][col] += a[i][j]*2;
					
				}
			}
			System.out.println();
			for(int i=0; i<=row; i++){
				for(int j=0; j<=col; j++)
				    System.out.print(" "+sum[i][j]);
				System.out.println();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
