class Value
{
	int length,breadth,height;
	Value(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	
}
class Weight extends Value
{
	int weight;
	Weight(int l,int b,int h,int w)
	{
		super(l,b,h);
		weight=w;
	}
	int volume()
	{
		return length*breadth*height;
	}
	void display()
	{
		System.out.println("The weight is:"+weight);
	}
}
class Super
{
	public static void main(String args[])
	{
		int v;
		Weight obj=new Weight(5,10,9,4);
		v=obj.volume();
		System.out.println("The volume is :"+v);
		obj.display();
	}
}