package examples;


enum Season{WINTER,SUMMER,FALL,SPRING}

public class Enum_Example2 {
   // defining enum within class
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example for definng  enum outside a class");
		System.out.println("Note :Outside defining enum shouldnt be ");
		System.out.println("proceeded with puclic, void ,private etc.");
		System.out.println("printing values of enum season");
		for(Season s:Season.values()) { // going tru set of values using values()
         System.out.println(s);
		}
       System.out.println("printing the values of enum season individually");
       //dispalying individual values using valueOf()
       //ordinal() is used to display the index values of constant
       System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
       System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
       System.out.println("Index of SPRING is: "+Season.valueOf("SPRING").ordinal());		   
	
	}
}
