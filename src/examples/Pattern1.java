package examples;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		
		System.out.println();
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < 5 ; j++) {
				if (i==j) {
				System.out.print("*"+" ");
			     } 
				else {
				System.out.print("1"+" ");
			     }
			
		   }
			System.out.println();
		}
		
		
         System.out.println();
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < 5 ; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
				System.out.print("*"+" ");
			     } 
				else {
				System.out.print(" "+" ");
			     }
			
		   }
			System.out.println();
		}
		
	}

}