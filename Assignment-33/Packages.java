import pack1.Square;
import pack2.Cube;
class Packages{
public static void main(String args[])
{
	int i=10;
	Square obj1= new Square();
	Cube obj2= new Cube();
	System.out.println("The square of i :"+obj1.square(i));
	System.out.println("The cube of i :"+obj2.cube(i));
}
}


