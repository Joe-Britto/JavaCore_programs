package examples;

class supparent{
	int a = 10;
	
	 
	public supparent() {
		 super();  // default super() extended from Object class.In constructor of
		// a class it should be in first line of constructor,donot mention in 
		 //the second or third line 
		System.out.println("parent constructor");
	}
	
	void display() {
		System.out.println("parent class");
	}
}

class supchild extends supparent{
	int a = 20;
	
	
	public supchild() {
		super();  // default super() extended from Object class.In constructor of
		// a class it should be in first line of constructor,donot mention in 
		 //the second or third line 
		System.out.println("Child constructor");
	}
	void display() {
		System.out.println("Child class");
		System.out.println("Child class variable a = " +a);
		System.out.println(" super class variable a  inside child class = " +super.a);
		
		System.out.println("Accessing parent method from child class");
		super.display();
	}
}
public class Super1_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("'Super or super()' keyword is used to access immediate");
          System.out.println("parent class instance variable,methods and constructor using");
          System.out.println("Child class objects . But the name of parent class ");
          System.out.println("instance variable,methods and constructor should be same");
          
          System.out.println("When it comes to constructor ,the default super() is extended from");
          System.out.println("default object class ");
          System.out.println("Every class created by deafult extended by Object calss");
          System.out.println("eg; class parent extends Object{}");
          System.out.println("In constructor of\n"
          		+ "a class it should be in first line of constructor,donot mention in \n"
          		+ "the second or third line ");
          System.out.println();
          System.out.println(" output program result:");
          supchild supcobj = new supchild();
          
            supcobj.display();
//            super.supcobj.display();
//          System.out.println("value of int child class"+supcobj.display());
//          System.out.println("value of int parent class"+ super.display()));
	}

}
