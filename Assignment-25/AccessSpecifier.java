class Test{
	public int a=5;
	private int b=6;
	protected int c=7;
	int d=8;
	void display()
	{
		System.out.println("The values of a b c d are : "+a+" "+b+" "+c+" "+d);
	}
	
	int show()
	{
		return b;
	}
}

class AccessSpecifier{
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.display();
		System.out.println("the value of a which is declared as public is "+ob.a);
		System.out.println("the value of b which is declared as private is "+ob.show());		
		System.out.println("the value of c which is declared as protected is "+ob.c);
		System.out.println("the value of d which is declared as default is "+ob.d);
	}
}