
package examples;

public class Thread_difmethods6{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Runnable interface using Anonymous class and Lambda exp.");
		System.out.println("we have used join(),setName(),getName(),setPriority() and \n"
				+ "getPriority() -> maximun_priority value is 10 ,"
				+ "minimun_priority value is 1 and normal_priority value is 10");
		
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
		thi.setPriority(10);
		System.out.println("First Thread priority is :"+ thi.getPriority());
		System.out.println("is thread thi is active?: "+thi.isAlive());
		thi.setName("First Thread");
		System.out.println("Name of this thread is :"+thi.getName());
		thi.join(); 
		// the join() method waits for the thread thi.start() to complete execution
		System.out.println("is thread thi is active?: "+thi.isAlive());
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
		thello.join();	 
		// the join() method waits for the thread thello.start() to complete execution
		System.out.println("Last stm to print after waiting for other threads \n"
				+ "to complete their excution using join()");
		}
	}
