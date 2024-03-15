package examples;

public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
		
		// using For Each loop we can print values of a[]
		
		for (int value:a) {
			System.out.print(value+" ");
		}

		System.out.println();
		
		for (int temp[]:b) {
			for (int value:temp) {
				System.out.print(value +" ");
			}
			System.out.println();
		}
	}

}
