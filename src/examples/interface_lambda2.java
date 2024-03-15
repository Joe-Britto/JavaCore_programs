package examples;

interface lam2{
	void display(int i , int j);
}
interface lam3{
	int add(int i , int j);
}

public class interface_lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lam2 lm2 = (i,j)-> System.out.println("value of i and j are :"+i+" & "+j);
		lm2.display(5, 2);
		
		lam3 lm3 = (i,j)-> i + j ; 
		// Note : No need to mention "return" keyword (i.e return i +j;) 
         System.out.println();
         int res = lm3.add(10, 30);
         System.out.println("Sum is of i and j is: "+res);
	}

}

