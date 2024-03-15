package examples;

import java.util.Scanner;

public class ArrTransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Transpose Of Matrix i.e converting rows into col");
		
		System.out.println("Enter No Of rows of Matrix A");
		int row = sc.nextInt();
		System.out.println("Enter No Of cols of Matrix A");
		int col = sc.nextInt();
		
		
		int a[][] = new int[row][col];
		
        for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value for " +i+" , "+j+" ");
				a[i][j] = sc.nextInt();
			}
		}
        sc.close();
        System.out.println("Output: Transpose of  matrix A is:");
        //below assignment is interchange rows and cols in 
        // i.e [a[0].length] -cols    , [a.length] - rows
        // int b[][] = new int[col][row];  - can also be used.
        int b[][] = new int[a[0].length][a.length];
        
        for (int i = 0; i < a[0].length; i++) {
			
			for (int j = 0; j < a.length; j++) { 
				b[i][j] = a[j][i];
				System.out.print(b[i][j] +" ");
			}	
			System.out.println(); 
		}    
	}

}
