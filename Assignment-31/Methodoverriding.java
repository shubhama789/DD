class A{
int a=5,b=7;
void display(){
	System.out.println("THe values of a and b are : "+a+" "+b);
}
}

class B extends A{
void display(){
	int c=9;
	System.out.println("THe values of c is : "+c);
}
}
class Methodoverriding{
public static void main(String args[]){
	B obj = new B();
	obj.display();
}
}