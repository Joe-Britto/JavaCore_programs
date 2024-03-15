package examples;

public class Thread_RunremoverefObj5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Runnable interface using Anonymous class and Lambda exp.");
		System.out.println("PASSED Runnable interface using Anonymous class and \n"
				+ "Lambda exp. as an argument to Thread()");
		
//		Runnable hi = ()-> {  
//			    for(int i = 0; i<5; i++){
//				System.out.println("HI");
//				try {Thread.sleep(1000);} catch (Exception e) {}
//				//1000 msec is eqaul to 1 sec
//			      }
//		      };
//		
//		Runnable  hello = ()-> {  
//			for(int i = 0; i<5; i++){
//				System.out.println("Hello");
//				try {Thread.sleep(1000);} catch (Exception e) {}
//				//1000 msec is eqaul to 1 sec
//			    }
//		      };
		
		Thread thi = new Thread(()-> {  
		    for(int i = 0; i<5; i++){
			System.out.println("HI");
			try {Thread.sleep(1000);} catch (Exception e) {}
			//1000 msec is eqaul to 1 sec
		      }
	      });
		
		thi.start();
		try {Thread.sleep(500);} catch (Exception e) {}
		// above stm is used to give priority to the thread , Hi2 and Hello2
		
		Thread thello = new Thread(()-> {  
			for(int i = 0; i<5; i++){
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
				//1000 msec is eqaul to 1 sec
			    }
		      });
		thello.start();	
		
	 }
	}
