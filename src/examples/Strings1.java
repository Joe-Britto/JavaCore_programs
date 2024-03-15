package examples;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String objects are immutable ,meaning\n"
				+ "its memory content cannot be replaced by another data ");
		
		String s = "hello";
		System.out.println("length :"+s.length());
		System.out.println("Index of l :"+s.indexOf('l'));
		System.out.println("Index of hello :"+s.indexOf("hello"));
		System.out.println("character at index 3 is :"+s.charAt(3));
		System.out.println("Uppercase  :"+s.toUpperCase());
		//s = s.concat(" world");
		s = s  + " world";
		System.out.println("concatenate words: "+s);
		
		// equalTo(), == and compareTo()
		System.out.println("compareTo returns 3 values \n"
				+ "0 value- when strings are same \n"
				+ " +ve value - \n"
				+ " -ve value \n"
				+ "ASCII values    A-> 65  , a->97 Z->90 z->122");
						
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "cello";
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		
		String s4 = "    HI   ";
		System.out.println("length of s4 before trim() "+s4.length());
		s4 = s4.trim();
		System.out.println("length of s4 after trim() "+s4.length());
		String s5 = "Good Morning";
		s5 = s5.replace("Morning","Evening");
		System.out.println("replacing words  "+s5);
		
		String s6 = "Amazing";
		System.out.println("substring() and subsequence() behaves similar");
		System.out.println("Substring of s6 "+s6.substring(3));
		System.out.println("Substring of s6 "+s6.substring(0,3));
		System.out.println("contains() is used for pattern matching and \n"
				+ "its case sensitive");
		System.out.println("Pattern checking of zin "+s6.contains("zin"));
		
		String s7 = "abc";
		String s8 = "ABC";
		System.out.println("using equals()"+s7.equals(s8));
		System.out.println("using equalsIgnoreCase()"+s7.equalsIgnoreCase(s8));
		
		String s9 = "hellol";
		int temp = s9.lastIndexOf('l');
		System.out.println("using lastIndexOf('l') is :" +temp);
		
		String strs = "victory-java-programming";
		System.out.println("split() will always return array of strings");
		String ss[] = strs.split("-");
		
		for (String tem22:ss) {
			System.out.println(tem22);
		}
		System.out.println("Now converting string to char  array");
		
		char ch[] = strs.toCharArray();
		for (char c:ch) {
			System.out.println(c);
		}
		System.out.println("Now again chararray to string");	
		String rev = String.valueOf(ch);
		System.out.println("chararray to String is: "+rev);
		
	}

}
