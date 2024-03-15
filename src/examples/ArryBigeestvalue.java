package examples;

import java.util.Scanner;

public class ArryBigeestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [4];
		int max = 0;
				System.out.println("Enter the values of arrays");
		for (int i = 0; i<arr.length; i++) {
		    arr[i] = sc.nextInt();
		     
		    //for (int i = 0; i<arr.length; i++) {
		      
		       if ( max < arr[i]) 
		    	   max = arr[i];		       		    
		}
		System.out.println("The biggest element is:" +max);
		sc.close();
	}

}
