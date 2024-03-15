package examples;

import java.util.Scanner;

public class ArrAddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition of Two matrix ");
		System.out.println("Note: The order of 2 matrix should be same  ");
		System.out.println(" eg; 2x2  and 2x2 ");
		// Below code is for entering values thru keyboard 
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter no. of rows  Matrix A");
				int row = sc.nextInt();
				
				System.out.println("Enter no. of cols Matrix A");
				int col = sc.nextInt();
				
				int a[][] = new int[row][col];
				
		          for (int i = 0; i < a.length; i++) {
					
					for (int j = 0; j < a[i].length; j++) {
						System.out.println("Enter value for " +i+" , "+j+" ");
						a[i][j] = sc.nextInt();
					}
					//System.out.println(); 
				}
		          
		          System.out.println("Enter no. of rows  Matrix B");
					row = sc.nextInt();
					
					System.out.println("Enter no. of cols Matrix B");
					col = sc.nextInt();
					
					int b[][] = new int[row][col];
					
			          for (int i = 0; i < b.length; i++) {
						
						for (int j = 0; j < b[i].length; j++) {
							System.out.println("Enter value for " +i+" , "+j+" ");
							b[i][j] = sc.nextInt();
						}
						//System.out.println(); 
					}
		          
			          System.out.println("Output matrix A + B is:");
			          int c[][] = new int[row][col];
			          for (int i = 0; i < row; i++) {
			  			
			  			for (int j = 0; j < col; j++) { 
			  				c[i][j] = a[i][j]  + b[i][j];
			  				System.out.print(c[i][j] +" ");
			  			}	
			  			System.out.println(); 
			  		}    
			          
		    sc.close();      
	}

}
