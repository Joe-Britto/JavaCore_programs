package examples;

class thread_demo extends Thread{
public void run() {
	  int a = 10;
	  int b = 20;
	  int c = a + b;
	  System.out.println("Thread is started running.....");
	  System.out.println("Sum of two numbers is :"+c);
}

}
public class ThreadExample1 {
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  thread_demo t11 = new thread_demo();
	  t11.start(); // this calls the run() method for execution of the thread class
   }

}
