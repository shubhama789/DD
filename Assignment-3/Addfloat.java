import javax.swing.JOptionPane;

public class Addfloat{
	public static void main(String args[])
	{
	String firstnumber,secondnumber;

	float number1,number2,sum;

	firstnumber = JOptionPane.showInputDialog("For addition:\nType your first number");

	secondnumber = JOptionPane.showInputDialog("Type your second number");	
	
	number1 = Float.parseFloat(firstnumber);
	
	number2 = Float.parseFloat(secondnumber);

	sum = number1 + number2;
	
	JOptionPane.showMessageDialog(null,"The result of the sum is "+sum,"Results",JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);
	
	}
	
}