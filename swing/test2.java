//with inheriting JFrame class...
import javax.swing.*;
public class test2 extends JFrame{
	public test2(){}
	public test2(String str){
		super(str);
	}
	public static void main(String[] args){
		test2 jf = new test2("Hits_Online");
		jf.setSize(400,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}