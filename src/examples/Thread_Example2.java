package examples;

class Hi {
	public void show() {
		for(int i = 0; i<5; i++)
		{
		System.out.println("HI");
		try {Thread.sleep(1000);} catch (Exception e) {}
		//1000 msec is eqaul to 1 sec
	}
	}	
}

class Hello {
	public void show() {
		for(int i = 0; i<5; i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);} catch (Exception e) {}
	}
	}
}
public class Thread_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		hi.show();
		hello.show();	

	}

}
