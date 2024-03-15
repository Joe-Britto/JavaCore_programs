package examples;

class Hi2 extends Thread{ 
//Now this class Hi becomes thread class after extending thread class
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

class Hello2 extends Thread{
//Now this class Hello becomes thread class after extending thread class
	public void run() {
	//this run() is called whenever start() called from main() 
		for(int i = 0; i<5; i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);} catch (Exception e) {}
	}
	}
}

public class Thread_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi2 hi2 = new Hi2();
		Hello2 hello2 = new Hello2();
		//Now hi and hello becomes thread class object 
		hi2.start();
		try {Thread.sleep(500);} catch (Exception e) {}
		// above stm is used to give priority to the thread , Hi2 and Hello2
		hello2.start();	

	}

}
