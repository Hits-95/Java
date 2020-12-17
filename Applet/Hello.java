import java.awt.*;
import java.applet.*;

public class Hello extends Applet {

	String str;
	public void init(){
		str = new String("Hello Friends ");		
	}
	public void paint(Graphics g) {
		g.drawString(str,10,100);
	}
}