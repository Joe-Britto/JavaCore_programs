package examples;


interface lam{
	void show();
}
public class interface_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lambda Expression is used only in Functional Interface /n"
				+ "and its symbol is arrow ->.If 2 statements are used after Lambda ,then \n"
				+ "remove lambda and use curly braces");
		
//		    lam lm = new lam() {
//		    	public void show() {
//		    		System.out.println("Lambda output ");
//		    	}
//		    };
            
		// The below statement is  equivalent to the above commented codes 
		// by lambda expression.Since there is only one method with one statement
		// we had removed all the other things just used print statement.
		    lam lm = () -> System.out.println("Lambda output ");
		    lm.show();
	}

}
