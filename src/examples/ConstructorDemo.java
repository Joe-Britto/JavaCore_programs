package examples;

class ConstructorClass{
	int num1 ;
	int num2 ;
	int result ;
	
	ConstructorClass(){    // Default Constructor
		System.out.println("Hi I'm default constructor ");
		
	//	num1 = 10;
//		num2 = 20;
	}
	
	ConstructorClass(int a, int b){    //parametrised Constructor
		num1 = a;
		num2 = b;
	}
	
	 void display() {
		 result = num1 + num2 ;
		 System.out.println("result ="+result );
	 }
}


public class ConstructorDemo {  /// main Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Some points about Constructor Method");
		System.out.println("Constructor Method is similar to a normal method");
		System.out.println("The Constructor Method has the same name as the Class name");
		System.out.println("Constructor Method does not have any return type such as void,int etc");
		System.out.println("Constructor Method is used to allocate memory and intialize object");
		System.out.println();
				
		   ConstructorClass Obj1 = new ConstructorClass();
          
                      System.out.println();
           ConstructorClass Obj2 = new ConstructorClass(40,50);
           Obj2.display();
	}

}
