package examples;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 8/5; //  critical stm and exceptionhandling
			System.out.println("try blk outer");
			
			try {
				int c[] = {2};
				   c[23] = 10;  //critical stm and exceptionhandling
				   // 23rd element of c[] does not exists 
			}catch(Exception e) {
				System.out.println("Exception value inner try:"+e);
					} 
		}
			catch(Exception e) {
			System.out.println("Exception value outer try:"+e);
		}
         
		finally {
			System.out.println("Thanks for checking Exception");
			System.out.println("Finally block will be executed irrespective of ");
			System.out.println("Exception handled or not ");
		}
	}

}
