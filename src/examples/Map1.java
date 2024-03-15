package examples;
import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mar interface is used to give some meaningfull\n"
				+ "names to index number and it follows the pattern such as \n"
				+ "'<Key,value>'pair  -> <Set,List). Eg; \n"
				+ "In HasMap and HashTable we cannot add null values.Whereas \n"
				+ "TreeMap , Null values are allowed.");
         
		Map <String,Integer> m1 = new HashMap<>();
		m1.put("Ram", 92);
		m1.put("Joe", 95);
		m1.put("Mark", 91);
		m1.put("Ram", 92);
		m1.put("Anu", 92);
		System.out.println("HashMap values : "+m1);
		System.out.println(" in the above output Key value Ram is not repeated");
		System.out.println(" coz in Set no repeated values and its not ordered.");
		
		Map <String,Integer> m2 = new TreeMap<>();
		m2.put("Ram", 92);
		m2.put("Joe", 95);
		m2.put("Mark", 91);
		m2.put("Ram", 92);
		m2.put("Anu", 92);
		m2.put("Mary", null);
		System.out.println("TreeMap values : "+m2);
		System.out.println(" in the above output null value is displayed");
		System.out.println(" coz in Set ,there will be no repeated values  and \n"
				+ "output is in order.");
		
		System.out.println("Displaying key and values separatelt or together ");
		
		System.out.println("Key  values : "+m1.keySet());
		System.out.println("element values : "+m1.values());
		
		System.out.println("Printing using For loops");
				for (String key:m1.keySet())
			       System.out.println(key +":" +m1.get(key));
				
          System.out.println();
          System.out.println("To check key values :"+m1.containsKey("Anu"));
          System.out.println("To check key values :"+m1.containsValue(95));
	}

}
