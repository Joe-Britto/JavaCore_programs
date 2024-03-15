package examples;

import java.util.Scanner;

public class TwoDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[][] = new a[3][3];
		int b[][] = { {1,2,3} ,{4,5,6}, {7,8,9}};
		
		// Below code for displaying b[][]  array in matrix form
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b[i].length; j++) 
				System.out.print(b[i][j] +" ");
			System.out.println(); 
		}
        
		// Below code is for entering values thru keyboard 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of rows");
		int row = sc.nextInt();
		
		System.out.println("Enter no. of cols");
		int col = sc.nextInt();
		
		int c[][] = new int[row][col];
		
          for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c[i].length; j++) {
				System.out.println("Enter value for " +i+" , "+j+" ");
				c[i][j] = sc.nextInt();
			}
			//System.out.println(); 
		}
        
          
           System.out.println("The output matrix is:");
           
          for (int i = 0; i < c.length; i++) {
  			
  			for (int j = 0; j < c[i].length; j++) 
  				System.out.print(c[i][j] +" ");
  			System.out.println(); 
  		}
		sc.close();
	}

}
