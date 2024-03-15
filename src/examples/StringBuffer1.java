package examples;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program about StringBuffer and StringBuilder \n"
				+ "class. Both are used to make string as mutable.");
		   System.out.println();
          StringBuffer sb1 = new StringBuffer("hello");
          System.out.println("String value : "+sb1);
          System.out.println("Insert string value : "+sb1.insert(5, " People"));
          System.out.println("Insert string value : "+sb1.insert(0, " Joe "));
          System.out.println("Length: "+sb1.length());
          System.out.println("Reverse string: "+sb1.reverse());
          System.out.println("character of a string : "+sb1.charAt(1));
          System.out.println("Append string : "+sb1.append("world"));
          
          StringBuffer sb2 = new StringBuffer("hello");
          int val = sb1.compareTo(sb2);
          System.out.println("Compare string : "+val);
          System.out.println("Delete characters in string : "+sb2.delete(2, 4));
          StringBuffer sb3 = new StringBuffer("mam");
          System.out.println("Replace mam with mam : "+sb3.replace(1, 2, "o"));
          System.out.println("Replace mam with Bom : "+sb3.replace(0, 2, "Bo"));
          
          
	}

}
