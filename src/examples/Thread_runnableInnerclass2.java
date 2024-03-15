
package examples;

//class Hi21 implements Runnable{ 
////
//	public void run() {  
//	  for(int i = 0; i<5; i++)
//		{
//		System.out.println("HI");
//		try {Thread.sleep(1000);} catch (Exception e) {}
//		//1000 msec is eqaul to 1 sec
//	}
//	}	
//}
//
//class Hello212 implements Runnable{
////
//	public void run() {
//	//this run() is called whenever start() called from main() 
//		for(int i = 0; i<5; i++) {
//		System.out.println("Hello");
//		try {Thread.sleep(1000);} catch (Exception e) {}
//	}
//	}
//}

public class Thread_runnableInnerclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Runnable interface using Anonymous class");
		System.out.println("Note:in a Functional interface  we can have only one abstract \n"
				+ "method function");
		
		Runnable hi = new Runnable() { ///used anonymous class 
				public void run() {  
			    for(int i = 0; i<5; i++){
				System.out.println("HI");
				try {Thread.sleep(1000);} catch (Exception e) {}
				//1000 msec is eqaul to 1 sec
			      }
				}
				};
		
		Runnable  hello = new Runnable() { ///used anonymous class 
			public void run() {  
			for(int i = 0; i<5; i++){
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
				//1000 msec is eqaul to 1 sec
			    }
		      }
		    };
		
		Thread thi = new Thread(hi);
		
		thi.start();
		try {Thread.sleep(500);} catch (Exception e) {}
		// above stm is used to give priority to the thread , Hi2 and Hello2
		
		Thread thello = new Thread(hello);
		thello.start();	

	}
	}


