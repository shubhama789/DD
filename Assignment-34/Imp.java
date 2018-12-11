interface Animal{  
	public void eat();  
}  

public class Imp implements Animal{  

	public void eat()
	{
		System.out.println("eating");
	}     
 
	public static void main(String args[])
	{  
		Imp i=new Imp();
		i.eat();  
	}
}  