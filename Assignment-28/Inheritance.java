class A
{
	int a=5;
	int b=6;
	
}
class B extends A
{
	void display()
	{
		System.out.println("The values of a and b are : "+a+" "+b);
	}
	void sum()
	{
		System.out.println("The sum of a and b is : "+(a+b));
	}	 
}

class Inheritance{
	public static void main(String args[])
	{
		B ob = new B();
		ob.display();
		ob.sum();
	}
}