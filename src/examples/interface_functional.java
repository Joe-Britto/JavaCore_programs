package examples;

interface Myinterface{
	void display();
}

//class Subc implements Myinterface{
//	 public void display() {
//System.out.println("This anonymous inner class with Functional interface ");
//}
//}
public class interface_functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Functional interface will contain just one method()");
		System.out.println();
		Myinterface functinter = new  Myinterface() {
			public void display() {
				 System.out.println("This anonymous inner class with Functional interface ");
			 }
		};
          functinter.display();
          
	}

}
