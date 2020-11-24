package day16;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// reverse the number 123
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the revese number");
		int original = input.nextInt();
		int reverse = 0;
		int remainder;
		// original = 123
		while(original !=0) {
			
			remainder = original % 10;
			reverse = reverse * 10 + remainder;
			original = original / 10;
			
		}
		System.out.println("The reverse number is" + reverse);
  input.close();
	}

}
