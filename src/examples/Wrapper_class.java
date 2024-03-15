package examples;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wrapper Class program . Wrapper class is used to \n"
				+ "convert primitive data types(such as int , char,float and \n"
				+ "doble to object type and viseversa objects to primitive data\n"
				+ "type. \n"
				+ "Usually objects and string are stored in Heap memory and\n"
				+ "variable , methods and reference variables arefrom main() are\n"
				+ "stored in Stack memory (LIFO)");
		System.out.println("Example of wrapper class are ; \n"
				+ "Integer ,Double and Charater");
		
		  // primitive data type 
		   int a = 5;
		   double b = 10.6;
		   System.out.println("Below Examples;");
		   System.out.println("Primitive int value of 5 :"+a);
		   System.out.println("Now putting primitive data 5 into objects \n"
		   		+ "this is called 'Boxing' ,");
		   Integer wint = new Integer(a); // inserting 5 into objects-Boxing
		   //Integer dash shows that , there are better way doing the same thing
		   System.out.println("Boxing:inserting primitive data into objects:"+wint);
		   System.out.println("Similary for Doulbe");
		   Double wdb = new Double(11.56);
		   System.out.println("Boxing:inserting primitive data into objects:"+wdb);
		   
		   Integer wint1 = 34;
		   
		   System.out.println("Auto-boxing method:"+wint1);
		   System.out.println("Now converting objects data into primitive data");
		   int res1 = wint1.intValue();
		   System.out.println("unboxing object to Primitive data :  "+res1);
		   int res2 = wint1;
		   System.out.println("Auto-unboxing object to Primitive data :  "+res2);
	}

}
