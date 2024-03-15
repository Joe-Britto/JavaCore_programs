package examples;

public class Arraybasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		  a[0] = 10;
		  a[1] = 20;
		  a[2] = 30;
		  a[3] = 40;
		  a[4] = 50;
		for (int i =0; i<a.length; i++)
			System.out.println(a[i]);
		
	int b[] = {1,2,3,4,5,6,7,8,9,12,23,45,58};
	
	for (int i =0; i<b.length; i++)
		System.out.print(" "+b[i]);
		
	
	String c[] = {"Joe", "brit", "Joseph"};
	for (int i =0; i<c.length; i++)
		System.out.print(" "+c[i]);
		
		}

	}


