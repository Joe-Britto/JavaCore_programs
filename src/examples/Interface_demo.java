package examples;

interface Aa{
	  int age = 24;// this variable by default is static and final
	  public void show();  // this method by default is an abstract method
}

class Bb implements Aa{
	
	public void show() {
		System.out.println("This is a class and implements abstract method show() ");
	}
}
public class Interface_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("interface is kind of an Abstract class, so it cannot have objects\n"
				+ " but it cannot \n"
				+ "be inherited .its variable should be static and final.\n"
				+ "Its method is an abstract method and cannot override.Lastly ,\n"
				+ "constructor is not possible.");
		
		Bb objinterface = new Bb();
		objinterface.show();
		System.out.println("Age variable value :" + Aa.age);

	}

}
