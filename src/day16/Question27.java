package day16;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int originalNumber = input.nextInt();
		
		int sum = 0;
		int mul = 1;
		System.out.println("orginal number is "+originalNumber);
		while (originalNumber !=0) {
			int temp = originalNumber % 10;
			sum = sum +temp;
			mul = mul* temp;
			
		}
			System.out.println("sum of digit is" +sum);	
			System.out.println("mul of digit is" +mul);
			input.close();

	}
}
