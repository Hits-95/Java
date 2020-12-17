import javax.swing.*;
public class Add extends JFrame{
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	JButton b1;
	
	public Add(){}
	public Add(String str){
		super(str);
	}
	public void setComponets(){
		l1 = new JLabel(">> Addition Of Two Numbers <<");
		l2 = new JLabel("First Number ");
		l3 = new JLabel("Second Number ");
		l4 = new JLabel("Sum");
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("ADD");
		
		l1.setBounds(100,10,200,20);
		l2.setBounds(50,60,200,20);
		t1.setBounds(150,60,50,30);
		l3.setBounds(50,110,200,20);
		t2.setBounds(150,110,50,30);
		b1.setBounds(130,150,100,30);
		l4.setBounds(100,200,50,20);
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);		
		
	}
	public static void main(String[] args){
		Add jf = new Add(" *** Hits_Online ***");
		jf.setComponets();  //user define function
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}