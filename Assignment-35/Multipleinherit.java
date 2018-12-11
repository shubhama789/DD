interface KS
{  
	default void show(){
	System.out.println("Default KS's show method");
	}  
}  
interface SA
{  
	default void show(){
	System.out.println("Default SA's show method");
	}  
}
  
class Multipleinherit implements KS,SA{  
	public void show(){
		KS.super.show();
		SA.super.show(); 
	} 
	public static void main(String args[]){  
		Multipleinherit a = new Multipleinherit();  
		a.show();  
 }  
}