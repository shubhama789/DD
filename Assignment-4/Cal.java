import javax.swing.JOptionPane;

public class Cal{
	public static void main(String args[])
	{
	String firstnumber,secondnumber,option;

	float number1,number2,sum,sub,mul,div;
	int a=0;
while(a!=-99)
{

	option = JOptionPane.showInputDialog("Type your option from the below tasks:\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division \n -99.Exit.");

	a = Integer.parseInt(option);
	
if(a!=-99 && a<=4)
{

	firstnumber = JOptionPane.showInputDialog("Type your first number");

	secondnumber = JOptionPane.showInputDialog("Type your second number");	
	
	number1 = Float.parseFloat(firstnumber);
	
	number2 = Float.parseFloat(secondnumber);

	if(a==1)
	{
		sum = number1 + number2;
	
		JOptionPane.showMessageDialog(null,"The result of the addition is "+sum,"Results",JOptionPane.PLAIN_MESSAGE);
	}
	if(a==2)
	{
		sub = number1 - number2;
	
		JOptionPane.showMessageDialog(null,"The result of the substraction is "+sub,"Results",JOptionPane.PLAIN_MESSAGE);
	}
	if(a==3)
	{
		mul = number1 * number2;
	
		JOptionPane.showMessageDialog(null,"The result of the multiplication is "+mul,"Results",JOptionPane.PLAIN_MESSAGE);
	}
	if(a==4)
	{
		div = number1 / number2;
	
		JOptionPane.showMessageDialog(null,"The result of the division is "+div,"Results",JOptionPane.PLAIN_MESSAGE);
	}
	
}
if(a>4)
{
	
	JOptionPane.showMessageDialog(null,"Invalid Option","Error",JOptionPane.ERROR_MESSAGE);
}

}



	System.exit(0);
	}
	
}