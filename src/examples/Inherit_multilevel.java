package examples;

class Grandparent{
	int a;
	void display() {
		System.out.println("This is GrandParent class");
	}
}

class Parentclass extends Grandparent
{
	int b;
	void printparent() {
		System.out.println("This is Parent class");
	   }
  }

class Childclass extends Parentclass
{
	int c;
	void show() {
		System.out.println("This is Child class");
	 }
 }


public class Inherit_multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In muiltilevel inheritance ,the child class can ");
		System.out.println("access both the granparent and parent class ");
		System.out.println(" variables and methods but not vise versa i.e");
		System.out.println("granparent and parent class cannot acces child class variables and method");
		System.out.println("Below  is the output and do not use keywords such as");
		System.out.println("Class , Parent as class name ,u get erros");
		Childclass obj = new Childclass();
		 obj.a = 10;
		 obj.b = 20;
		 obj.c = 30;
		 System.out.println(obj.a);
		 System.out.println(obj.b);
		 System.out.println(obj.c);
		 
		 obj.display();
		 obj.printparent();
		 obj.show();
	}

}
