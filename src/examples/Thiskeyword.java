package examples;

class thiskey{
	int num1;  // num1 Instance variable of a class thiskey
	int num2;  // num2 Instance variable of a class thiskey
	
	thiskey(int num1 , int num2) {   //used as constructor
		// num1 and num2 are local variables inside a method()
		this.num1 = num1;  // this is used for class variables inside a method function
		this.num2 = num2;
	}
	void display() {
		System.out.println(num1);
		System.out.println(num1);
	}
}

public class Thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NOTE: In Any JAVA program do not use the same class name");
		System.out.println("in a package in different programs , it gives an syntax error.");
		System.out.println();
		System.out.println("'this' keyword is used for an instance variable ");
		System.out.println(" in a method of a class when a method variable has");
		System.out.println("the same name as instance variable.");
		
		thiskey thisk = new thiskey(10,20);
		thisk.display();

	}

}
