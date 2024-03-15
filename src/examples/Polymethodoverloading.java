package examples;

class Overload{
	int num1;
	int num2;
	int result;
	
	void sum(int a, int b){
		num1 = a;
		num2 = b;
		result = num1 + num2;
		System.out.println("Result is: "+result);
	}
	
	void sum(double a, double b){
		num1 = (int)a;  // this is called Typecast -conveting datatype to other datatype
		num2 = (int)b;
		result = num1 + num2;
		System.out.println("Result is: "+result);
	}
	
	void sum(int a, double b){
		num1 = a;
		num2 = (int)b;
		result = num1 + num2;
		System.out.println("Result is: "+result);
	}
}

public class Polymethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload obj = new Overload();
		obj.sum(5, 7);
		obj.sum(5, 2.5);
		obj.sum(5.5, 7.2);

	}

}
