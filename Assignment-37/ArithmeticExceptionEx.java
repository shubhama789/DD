class ArithmeticExceptionEx {
   public static void main(String args[]) { 
    int num1,num2; 
 
    try {
      num1 = 0; 
     num2 = 62 / num1;
      System.out.println("U are Under Try Block.");
    }
   catch (ArithmeticException e)
   {
      System.out.println("Error:Divide by zero.");
    } 
}
}