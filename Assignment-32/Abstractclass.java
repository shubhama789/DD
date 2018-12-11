abstract class A
{
	abstract void callme();
	
	void callmetoo()
	{
		System.out.println("This is a abstract class.");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("B's extended to abstract class");
	}
}
class Abstractclass
{
	public static void main(String args[])
	{
		B ob=new B();
		
		ob.callme();
		ob.callmetoo();
	}
}