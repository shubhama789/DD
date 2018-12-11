class Test{
int a;
Test(int i){
	a=i;
	}

void square(Test o){
	
	o.a *= o.a;
	}
}

public class Callbyref
{
	public static void main(String args[])
	{
		
		Test ob = new Test(15);
		System.out.println("\n\tThe value of a is "+ ob.a);
		ob.square(ob);
		System.out.println("\n\tThe square of a is "+ ob.a);
		
	}
	
	
}

