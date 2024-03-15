package examples;


public class Throw_test1 {
	public class Throw1{  //  inner class 
		
		public static void show(int age) {
			if (age < 18) {
				throw new ArithmeticException("Age less that 18yrs ,Not Eligible");
			}
				else {
			System.out.println("Eligible to cast vote");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Throw_test1.Throw1.show(24);
        System.out.println("Rest of the code is executed after the function call/n"
        		+ "show() if parameter is > 18, otherwise the statement below  /n"
        		+ "the function call show() will not be excuted when parameter <18/n"
        		+ " Note :throw can be used outside/without try and catch keyword");
	}

}
