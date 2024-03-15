package examples;

final class  finalclass{
	  
	final int fval = 10;
	  
	  final void display() {
		  System.out.println("value of final variable: "+fval);
	  }
}

  //class xyz  extends finalclass{       cannot inherit 
       
	//  final display() {  cannot overrided
//		  System.out.println("value of final variable: "+fval);
//  }
   
public class finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println("'final' keyword used in 3 places;");
		System.out.println("1.before variables and variable becomes constant value");
		System.out.println("2.before method() and method cannot be overridded");
		System.out.println("3.before classname and class cannot be inherited.");
		System.out.println("");
		
		finalclass fclass = new finalclass();
		fclass.display();
		System.out.println("");
	}

}
