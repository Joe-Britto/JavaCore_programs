package examples;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Collection is an interface , we cannot create \n"
				+ "objects from an interface .Collection is also called \n"
				+ "'CollectionFramework or CollectionAPI' . An interface \n"
				+ "can extend another interface. A class can implememt an \n"
				+ "interface \n"
				+ "import 'import java.util.*' to work on collection  ");
		System.out.println("Generics are used to avoid run time errors using .eg\n"
				+ "wrapper class such as <Integer> , <Double> ,<Character> ");
		
		
		Collection val2 = new ArrayList();
		val2.add(10);
		val2.add(23);
		val2.add(8);
		
		System.out.println("to display : "+val2);
		System.out.println("Anotherway of display values: ");
		for (Object a :val2) {
			System.out.print(" "+a);
		}
		
		System.out.println();
		Collection <Integer> val3 = new ArrayList <Integer> ();
		val3.add(11);
		val3.add(34);
		val3.add(9);
		System.out.println("display values using Integer type :");
		for (int a :val3) {
			System.out.print(" "+a * 2);
		}
		
	}

}
