package examples;

class Mathcal{
	int sum = 0;
	public int add(int j, int...i) {   
		for (int value:i) 
			sum = sum + value;
		
		System.out.println(j);
		return sum;
		}
		
}


public class ParaNo_ofpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using 3 dots '...' for n No. of  parameter in a methhod ");
		System.out.println("Note:The 3dots '...'variable  will be mentioned as the last parameter ");
		Mathcal obj = new Mathcal();
		Mathcal obj2 = new Mathcal();
		Mathcal obj3 = new Mathcal();
		
		int res = obj.add(4,1,2,3);
		int res2 = obj2.add(0,7,10,34,56,27);// variable arguments
		int res3 = obj3.add(10,19);// variable arguments

		System.out.println("Sum for 1st obj is  :" +res);
		System.out.println("Sum for 2nd obj2 is :" +res2);
		System.out.println("Sum for 3rd obj3 is :" +res3);

	}

}
