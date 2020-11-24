package day14;

import java.util.Scanner;

public class Question24 {
     // Factorial number 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		long fact   = 1;
		
		

		for(int i = 1; i <= num; ++i) {
			
			fact  = fact *i;
			
		}
		System.out.println("Factorial number of num is" + fact);	
		input.close();
		

	}

}


