package examples;

class Father{
	int a;
	void display() {
		System.out.println("This is Superclass");
	}
}

class Brother extends Father
{
	int b;
	void printparent() {
		System.out.println("This is Subclass");
	   }
  }

class Sister extends Father
{
	int c;
	void show() {
		System.out.println("This is Subclass");
	 }
 }

public class Inherit_hirarchiy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hirarchy Inheritance:only the subcalls can inherit"); 
		System.out.println("Superclass but they(subclass) cannot inherit / access ");
        System.out.println("other subclass variables or methods ");
        System.out.println("");
        Brother br = new Brother();
        Sister sr = new Sister();
        br.a = 10;
        sr.a =20;
        System.out.println(br.a);
        System.out.println(sr.a);
        br.display();
        sr.display();
        
	}

}
