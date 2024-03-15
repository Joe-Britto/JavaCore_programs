package examples;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Abnormal termination of a program is called ");
		System.out.println("Exception");
		System.out.println();
		
		try {
			int a = 5/0;  // ArthemticException coz zero divided by 5 is infinity
			System.out.println("Bye");
			//the above statement won't be executed once exception is found , 
			//it will terminate
		}catch (Exception e){
			System.out.println("value of exception e is:"+e);
		}
		System.out.println("try & catch kind of similar to if and else stm");
		System.out.println("catch (Exception e):- 'Exception' is a super/parent class of ");
		System.out.println("all the exception and 'e' is the object method .Use ");
		System.out.println("Exception e ,for all kinds of Arthmetic Exception.");
	}

}
