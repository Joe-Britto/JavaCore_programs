package examples;
import java.util.Scanner;
public class Keyboard_Enterdata {
	public static void main(String[] args){
	int a;
	int b;
	int c;
	
	//create a scanner object to read input
	
	Scanner console = new Scanner (System.in);
	
	System.out.println("Enter value for a");
	a = console.nextInt();
	System.out.println("Enter value for b");
	b = console.nextInt();
	 c = a + b;
	 System.out.println("Sum of a and B is" + c);
	}
    
}
