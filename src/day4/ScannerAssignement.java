package day4;

import java.util.Scanner;

public class ScannerAssignement {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number :" );
	int a = input.nextInt();
	System.out.println("Enter second number :");
	int b = input.nextInt();
	int sum = a+b;
	int average = (a+b)/2;
	System.out.println(sum);
	System.out.println("sum of "+ a + " and "+ b +" is:" + sum  );  
	System.out.println("Average of two numbers = " + average);
	
	
	
	input.close();
	}

}
