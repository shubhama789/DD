class Test{
 int square(int i)
 {
	System.out.println("The value of a is "+i);
  	i*=i;
 	return i;
 }
}
 public class Callbyvalue{
  public static void main(String args[])
  {
    int result,a=10;
    Test ob=new Test();
   result=ob.square(a);
  System.out.println("The square of a is "+result);
 }
}
