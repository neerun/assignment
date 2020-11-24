package day9;

import java.util.Scanner;

public class QuestionNo20 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the choice");
	int choice = input.nextInt();
	switch ( choice ) {
	case 1:
		System.out.println("This is Addition.");
		break;
	case 2:
		System.out.println("This is Division.");
		break;
	case 3:
		System.out.println("This is Multiplication.");
		break;
	case 4:
		System.out.println("This is Subtraction.");
		break;
	default:
	 System.out.println(" This is Invalid Error.");
	 break;
	 }
	 System.out.println(" More more more  code");
	 System.out.println("End Command.");
	 input.close();
	}

}
