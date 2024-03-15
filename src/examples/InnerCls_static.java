package examples;


class OuterCls_static{
	
	static  class InnerCls_static{
		public void display() {
			System.out.println("This is static inner class ");
		}
	}
	
 }



public class InnerCls_static{

	public static void main(String[] args) {
		// Pls make a note of below 2 statements for accessing members of
		// inner class 
		OuterCls_static.InnerCls_static ic = new OuterCls_static.InnerCls_static();
		ic.display();

	}

}
