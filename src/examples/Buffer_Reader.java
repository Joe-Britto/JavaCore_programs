package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);	
		BufferedReader br = new BufferedReader(isr);
		// the above stm can also be written as 
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// once done ,you can avoid the stm 
		//InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Enter a sentence");
		System.out.println();
		String st = br.readLine();
		System.out.println("output is :"+st);
//		int num  = Integer.parseInt(br.readLine());
//		System.out.println("num is:  " +num);

}
}
