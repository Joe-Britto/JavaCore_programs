
package examples;

class Counter{
	private int count;
	
	public synchronized void increment() {
		count = count + 1;
	}
	
	public int getCount() {
		return count;
	}
}

public class Thread_synchronise{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("In Threads , only one thread can excute or call class");
		System.out.println("method ,two or more threads cannot execute the same "
				+ "class method simutanously.To avoid this confusion we mention 'synchronized,/n"
				+ "in the method class decalaration. ");
		
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
		Counter c1 = new Counter();
		Thread thi = new Thread(()-> {  
		    for(int i = 0; i<5; i++){
			    c1.increment();
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
//		try {Thread.sleep(500);} catch (Exception e) {}
		// above stm is used to give priority to the thread , Hi2 and Hello2
		
		Thread thello = new Thread(()-> {  
			for(int i = 0; i<5; i++){
				 c1.increment();
			    }
		      });
		thello.start();	
		thello.join();	 
		// the join() method waits for the thread thello.start() to complete execution
		System.out.println("Last stm to print after waiting for other threads \n"
				+ "to complete their excution using join()");
		
	      System.out.println();
	     System.out.println("sum of 2 threads :" +c1.getCount());
          }
			// TODO Auto-generated method stub

		}
	
