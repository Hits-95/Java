import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Temp implements ItemListener {
	JFrame f1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JRadioButton r1,r2,r3;
	JCheckBox c1,c2,c3;
	
	public Temp(){
		f1 = new JFrame();
		l1 = new JLabel("Your Name    :- ");
		l2 = new JLabel("Your Class   :- ");
		l3 = new JLabel("Your Hobbies :- ");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
	    r1 = new JRadioButton("FY");
	    r2 = new JRadioButton("SY");
	    r3 = new JRadioButton("TY");
		c1 = new JCheckBox("Music");
		c2 = new JCheckBox("Dance");
		c3 = new JCheckBox("Sport");
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		g1.add(r3);
		
		f1.setLayout(new GridLayout(4,0));
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(l3);
		f1.add(r1);
		f1.add(c1);
		f1.add(r2);
		f1.add(c2);
		f1.add(r3);
		f1.add(c3);
		f1.add(t2);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(300,300);
		f1.setVisible(true);
	}
	public static void main(String args[]){
		new Temp();
	}
	public void itemStateChanged(ItemEvent ie){
		String name, cls, hob;
		name = "Name : "+t1.getText();
		cls = "Class : ";
		hob = "Hobbies : ";
		
		if(r1.isSelected())
			cls = cls+" FY ";
		
		if(r2.isSelected())
			cls = cls+" SY ";
		
		if(r3.isSelected())
			cls = cls+" TY ";
		
		
		if(c1.isSelected())
			hob = hob+" Music ";
		
		if(c2.isSelected())
			hob = hob+" Dance ";
		
		if(r3.isSelected())
		hob = hob+" Sport ";
	}
}