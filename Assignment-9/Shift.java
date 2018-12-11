public class Shift{
	public static void main(String args[]){
		int x=6,y=0,z=0;
		System.out.println("The initial values of x y and z are "+x+" "+y+" and "+z);
		System.out.println("\nAfter left Shift operation on X by 2");
		y=x<<2;
		
		System.out.println("The values of x and y are "+x+" and "+y);
		System.out.println("\nAfter right Shift operation on X by 1");
		z=x>>1;
		System.out.println("The values of x and z are "+x+" and "+z);
		}
}