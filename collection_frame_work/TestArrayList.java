import java.util.*;

public class TestArrayList{
	public static void main(String[] args) {
		int i;


		ArrayList l_obj = new ArrayList();

		if(args.length > 0){
			for(i=0; i<args.length; ++i)
				l_obj.add(args[i]);

			l_obj.add("Python");

			String s[] = new String[l_obj.size()];
			l_obj.toArray(s);

			System.out.println("Given Values \n");
			for(i=0; i<s.length; ++i)
				System.out.println(s[i]);
		}
		else{
			System.out.println("No arguments...");
		}
	}
} 