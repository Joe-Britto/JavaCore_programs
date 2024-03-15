package examples;

class t1{
	public void show() {
		System.out.println("this is parent class ");
	}
}

//class t2 extends t1{
//	public void show() {
//		System.out.println("this is child class ");
//}
	
//below class an abstract class 	with anonymous inner class 

abstract class t3{
	abstract public void display();
}


public class Innercls_anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Anonymous inner class is created by avoiding creating ");
		System.out.println("sub class as shown above (class t2) and creating just "); 
		System.out.println("a method in main class as shown below; ");
		System.out.println("its called anonymous inner class beoz its inside the main class");
		System.out.println();
		
		t1 tobj = new t1 () {
			public void show() {
				System.out.println("this is anonymous class ");
			}
		};
		 tobj.show();
		 
		 
		 //Second example with abstract class inner class anoymous
		 System.out.println();
		 t3 t3obj = new t3() {
			 public void display() {
				 System.out.println("This is abstract class with anoymous inner class");
			 }
		       };
		       
		       t3obj.display();

	}
}
