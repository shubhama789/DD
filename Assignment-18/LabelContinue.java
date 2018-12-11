public class LabelContinue{
	public static void main(String args[]){
	for(int x=0;x<5;x++)
	{
		int y;
		inner: for(y=0;y<5;y++)
		{
			
			if(y==3)
			{
			System.out.println("\nLabelled continue occured");
			continue inner;
			}
			System.out.println("\nThe values of x and y are "+x+" and "+y);
		}

	}
}

}