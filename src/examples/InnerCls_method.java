package examples;

class Outcls{
	
	private class Incls{
	   public void display() {
		   System.out.println(" This is private inner class");
	   }
	}
	
	public void get_access() {
		 Incls innc  = new Incls();
		 innc.display();
	}
}

public class InnerCls_method {

	public static void main(String[] args) {
		System.out.println("Usually class can decalred as public , final and abstract");
		System.out.println("but only inner class can be decalred as private.");
		System.out.println(".Members of private class can be accessed within the");
		System.out.println("outer calss and not in main class.Below is the example;");
		System.out.println();
		Outcls otc = new Outcls();
            otc .get_access();
	}

}
