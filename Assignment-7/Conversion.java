public class Conversion{
	public static void main(String args[]){
		int i;
		double d=264.156;
		byte b;
		
		System.out.println("\nAfter Conversion of double to int");
		i=(int)d;
		System.out.println("The values of d and i are "+d+" and "+i);
		System.out.println("\nAfter Conversion of int to byte");
		b=(byte)i;
		System.out.println("The values of i and b are "+i+" and "+b);
		}
}