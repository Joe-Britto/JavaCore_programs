
package examples;

class Hi21 implements Runnable{ 
//
	public void run() {  
	//this run() is called whenever start() called from main() 
		for(int i = 0; i<5; i++)
		{
		System.out.println("HI");
		try {Thread.sleep(1000);} catch (Exception e) {}
		//1000 msec is eqaul to 1 sec
	}
	}	
}

class Hello21 implements Runnable{
//
	public void run() {
	//this run() is called whenever start() called from main() 
		for(int i = 0; i<5; i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);} catch (Exception e) {}
	}
	}
}

public class ThreadRunnable_interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Runnable is an interface and doesn't contain a start()");
		System.out.println("using Runnable interface in thread is that we can reduce \n"
				+ "the no. of. programming lines by using Lambda expression");
		
		Runnable hi = new Hi21();
		Runnable  hello = new Hello21();
		//Now hi and hello becomes thread class object as Runnable interface as reference
		
		Thread thi = new Thread(hi);
		
		thi.start();
		try {Thread.sleep(500);} catch (Exception e) {}
		// above stm is used to give priority to the thread , Hi2 and Hello2
		
		Thread thello = new Thread(hello);
		thello.start();	

	}

}
