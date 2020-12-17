import java.io.*;
public class Student_Resut{
	public static void calResult(int[] a){
		int total = 0;
		float per = 0;
		
		for(byte i=0; i<a.length; i++){
			total += a[i];
		}
        per =(float) total/a.length;
        System.out.print("\t Total = "+total+"\t Persentage = "+per);		
	}
	public static void main(String[] args){
		int std[][];
		byte row,col;
		
		try{
			BufferedReader hit = new BufferedReader( new InputStreamReader(System.in));
			System.out.print("\t How many student :- ");
			row = Byte.parseByte(hit.readLine());
			std = new int[row][];
			for(byte i=0; i<row;i++){
				System.out.print("\t How many subjects of Roll No "+i+" :-");
				col = Byte.parseByte(hit.readLine());
				std[i] = new int[col]; 
				System.out.print("\t Enter Roll no - "+i+" marks :- ");
                for(byte j=0; j<col; j++)
 					std[i][j] = Integer.parseInt(hit.readLine());
			}
			System.out.println("\t -------Result---------");
			for(byte i=0; i<std.length; i++){
				for(byte j=0; j<std[i].length; j++){
					System.out.print(" "+std[i][j]);
				}
				calResult(std[i]);
				System.out.println();
			}
				
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
