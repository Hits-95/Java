//without inheriting JFrame class...
import javax.swing.*;
public class test1{
	public static void main(String[] args){
		JFrame jf = new JFrame("Hits");
		jf.setSize(400,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}