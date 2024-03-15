package examples;

import java.util.Scanner;

public class Arrjarred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A matrix with difrrent columns is called jagged matrix");
		
		int a[][] = new int[3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
         
		
		
		System.out.println("Enter value of jagged matrix ");
		
		for (int i = 0; i < a.length; i++) {
			   for (int j = 0; j < a[i].length; j++) {
				   System.out.print("Enter the value of " +i+" "+j+" ");
				   a[i][j] = sc.nextInt();
			   }
			   System.out.println();
		   }
		
		 sc.close();
//		   for (int temp[]:a) {
//			   for (int value:temp) {
//				   value = sc.nextInt();
//			   }   
//			   System.out.println();
//			 }
//		   sc.close();
//		   System.out.println("Jarred Array Output is:");
//		   
//		   for (int temp[]:a) {
//			   for (int value:temp) {
//				   System.out.print(value +" ");
//			   }   
//			   System.out.println();
//			 }
		   
		 sc.close();
		   for (int i = 0; i < a.length; i++) {
			   for (int j = 0; j < a[i].length; j++) {
				   System.out.print(a[i][j] +" ");
			   }
			   System.out.println();
		   }
	}

}
