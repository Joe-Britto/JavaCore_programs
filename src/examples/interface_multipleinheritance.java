package examples;

interface Aaa {
	void show();
}

interface Bbb {
	void show();
}

class Cc {
	 public void greet() {
		 System.out.println("HI from class Cc");
	 }
	}

class Intchild extends Cc implements Aaa,Bbb{
	  public void show() {
		  System.out.println("HI I'm from Child class ");
	  }
	  public void display() {
		  System.out.println("Display method from Child class ");
	  }  
}
public class interface_multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intchild trobj = new Intchild();
		trobj.show();
		trobj.greet();
		trobj.display();

	}

}
