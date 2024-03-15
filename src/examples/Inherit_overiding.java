package examples;

class Superclass{
	int a;
	void display() {
		System.out.println("This is Superclass");
	}
}

class Subclass extends Superclass
{
	int b;
	void display() {
		System.out.println("This is Subclass");
	   }
  }


public class Inherit_overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Method overriding: in this the method in parent/super class");
		System.out.println("and method in child/subclass have the same name .");
		System.out.println("the method in the subcalsss will override the method ");
		System.out.println("in superclass i.e the subclass will execute its own method");
		System.out.println("when object of subclass is created as shown in the below eg.");
		System.out.println("Note: final and static method cannot be overriden ");
		System.out.println("");
		System.out.println("");
		Subclass subc = new Subclass();
		subc.display();
		
	}

}
