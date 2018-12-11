public class Continue{
	public static void main(String args[]){
		for(int x=0;x<10;x++)
		{	
		
		if(x<3)
		{
			continue;
		}
		System.out.println("\nThe value of x is "+x);
		}
		System.out.println("\nThe value of x before 3 will not print");
		
	}
}
