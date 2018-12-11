public class Methodoverloading
{
	public static void main(String args[])
	{
		int result;
		double result1;
		result=square1(10);
		System.out.println("\n\tThe square of a is "+result);
		result1=square1(10.25);
		System.out.println("\n\tThe square of a is "+result1);
	}
	static int square1(int a)
	{
		System.out.println("\nThe value of a is "+a);
		return a*a;
	}
	static double square1(double a)
	{
		System.out.println("\nThe value of a is "+a);
		return a*a;
	}
		
	
}

