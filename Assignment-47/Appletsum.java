import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

public class Appletsum extends JApplet{
	public void  paint(Graphics g)
	{
		int num1,num2,sum;
		num1=1;
		num2=2;
		sum=num1+num2;
		g.drawString("The summation is: "+sum,200,20);
	}
}
	
