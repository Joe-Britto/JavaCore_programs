package examples;

class OuterCls{
	
	class InnerCls{
		public void display() {
			System.out.println("This is inner class ");
		}
	}
}
public class InnerClass_nested {

	public static void main(String[] args) {
		// Pls make a note of below 2 statements for accessing members of
		// inner class 
		OuterCls oc = new OuterCls();
		OuterCls.InnerCls ic = oc.new InnerCls();
		ic.display();

	}

}
