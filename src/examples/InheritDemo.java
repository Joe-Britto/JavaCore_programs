
package examples;

class Parent{
	int a;
	void display() {
		System.out.println("This is Parent class");
	}
}

class Child extends Parent{
	int b;
	void show() {
		System.out.println("This is Child class");
	}
}


public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Parent p = new Parent();
		Child c = new Child();
		
		c.a = 10; // accessed Parent class variable a
		c.b = 20;
		c.display();  // accessed Parent class method display()
		c.show();
		System.out.println("Value of a is:"+c.a); 
		System.out.println("Value of b is:"+c.b);
		
	}

}
