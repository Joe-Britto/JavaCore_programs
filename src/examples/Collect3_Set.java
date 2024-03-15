package examples;
import java.util.*;

public class Collect3_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In List interface , the draw back is that it \n"
				+ "produces repeated values ,whereas in Set interface \n"
				+ "duplicates / repeated values are not allowed and it is \n"
				+ "in unordered ");
		System.out.println("Drawback in Set : we cannot use indexOf()");
		System.out.println();
		Set <Integer> cset = new HashSet <>();
		 cset.add(12);
		 cset.add(25);
		 cset.add(32);
		 cset.add(56);
		 cset.add(5);
		 cset.add(12);
		 System.out.println();
		 System.out.println("displaying Hashset unordered int values :"+cset);
		
		 Set <Integer> cts = new TreeSet <>();
		 cts.add(12);
		 cts.add(25);
		 cts.add(32);
		 cts.add(56);
		 cts.add(5);
		 cts.add(12);
		 System.out.println();
		 System.out.println("displaying Treeset ordered int values  :"+cts);
		 System.out.println("Drawback in Set : we cannot use indexOf()");

	}

}
