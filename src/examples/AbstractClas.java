package examples;

abstract class Bike{
	 Bike(){
		 System.out.println("This is Abstract Bike class");
		 }
	 
	abstract void run(); // Note:, use semicolon after abstract method declaration 
	// implementation of this abstract method can be used in derived class
}

class Jawa extends Bike{
	
	void run() {
		System.out.println("jawa is running");
	}
}
public class AbstractClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jawa jw = new Jawa();
		jw.run();
		

	}

}
