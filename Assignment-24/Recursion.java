public class Recursion
{
	public static void main(String args[])
	{
		int a,b=5;
		a=rec(b);
		System.out.println("\nThe Factorial of "+b+" is "+a);
	}
	static int rec(int x)
	{
		if(x==1)
		return 1;
		else
		return(x*rec(x-1));
	}
}