public class Scope{
	public static void main(String args[]){
		int x=10;
	{
		int y=20;
		System.out.println("\nInside the Scope:\n");
		System.out.println("The values of x and y are "+x+ "and" +y);
		System.out.println("\nSo,Outer Variable is available to Inner Scope");
		x=y*3;
		System.out.println("The value of x after performing operation on x is "+x);
	}
	System.out.println("\n\t Outside the Scope:\n");
	System.out.println("\tThe value of x is "+x);
	//y=100;
	System.out.println("\t y is not declared outside the scope");
	System.out.println("\nSo,Inner Variable is not available to Outer Scope");
}
}