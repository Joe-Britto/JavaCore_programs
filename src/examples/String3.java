package examples;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Difference between equals() and == in string\n"
				+ "comparison ");
		
		String scom1 = "hello";
		String scom2 = "hello";
		System.out.println("Compare of 2 str :"+scom1.equals(scom2));
		System.out.println("Compare of 2 str :"+(scom1==scom2));
		System.out.println("equals() compares the content of string whereas\n"
				+ "== compares the address.check other example"); 
		String scom3 = new String("hello");
		System.out.println("Compare of 2 str :"+scom1.equals(scom3));
		System.out.println("Compare of 2 str :"+(scom1==scom3));
		System.out.println("NOTE:Always use equals() while comparing string");
	}

}
