public class LabelBreak{
	public static void main(String args[]){
	for(int x=0;x<5;x++)
	{
		int y;
		inner: for(y=0;y<10;y++)
		{
			
			if(y==3)
			break inner;
			System.out.println("\nThe values of x and y are "+x+" and "+y);
		}
		System.out.println("\nLabelled break occured");

		}
	}

}