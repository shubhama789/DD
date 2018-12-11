public class Nestedifelse{
	public static void main(String args[]){
		int x=5;
		int y=7;
		int z=3;
		int l;
		System.out.println("\nThe values of x , y and z are "+x+" "+y+" and "+z);
		if(x>y)
		{
			if(x>z)	
			System.out.println("\nX is the largest");
			else
			System.out.println("\nZ is the largest");
		}

		else
		{
			if(y>z)	
			System.out.println("\nY is the largest");
			else
			System.out.println("\nZ is the largest");
		}
	}
}
