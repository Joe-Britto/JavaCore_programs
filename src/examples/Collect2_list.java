package examples;
import java.util.*;

public class Collect2_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Collection interface ,we can only add values \n"
				+ "and cannot sort or index the values.In 'List interface' \n"
				+ "the values will be sorted and can get index value .Eg;");
		
		//List <Integer> lval =  new ArrayList<>();
		ArrayList<Integer> lval =  new ArrayList<>();
		//instead of List Interface you can use ArrayList child class in the
		// declaration ,which will contains more options or methods than 
		 // List and Collection interface.
		lval.add(10);
		lval.add(23);
		lval.add(8);
		lval.add(2,75);  // added values using index
		  
		 System.out.println(lval);
		  System.out.println(lval.size());
//		for (int a :lval) {
//			System.out.print(" "+a.);
//		}

	}

}
