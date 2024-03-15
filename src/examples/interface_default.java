package examples;


interface def{
	default void show() {
		System.out.println("deafault method in an interface ");
	}

	static void display(){
		System.out.println("Static method in an interface");
	}
	}

class cdefault implements def{
	
}
public class interface_default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Note : an interface can contain only one ");
		System.out.println("abstract method but it can have 2 or more ");
		System.out.println("default or static method");
        def df1 = new cdefault();
        df1.show();
        def.display();
        
	}

}
