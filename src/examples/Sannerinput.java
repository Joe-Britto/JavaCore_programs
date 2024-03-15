package examples;

import java.util.lang; // this is a default import statements
import java.util.Scanner;  
//the above scanner class is used for input from user during run time .

public class Sannerinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);  // creates a object sc of class Scanner 
       System.out.println("Enter your name:");
       String name = sc.next();
       System.out.println("Enter your age:");
       int age = sc.nextInt();
       System.out.println("Enter Temperature:");
       double temp = sc.nextDouble();
       System.out.println("Enter a character:");
       char ch = sc.next().charAt(0);
       
       System.out.println("Your name:" +name);
       System.out.println("Your age:" +age);
       System.out.println("Temperature:" +temp);
       System.out.println("Character:" +ch);
       
       sc.close();    //  needs to close once Scanner object is created.
       
	}

}
