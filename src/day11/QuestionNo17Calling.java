package day11;

import java.util.Scanner;

// write a program to calculate leap year?
public class QuestionNo17Calling {

	public static void calculateleapyear() {
	Scanner input = new Scanner(System.in);
	System.out.println(" calulate leap year");
	double lpyr= input.nextDouble();
	 
	if (lpyr%4 == 0) {
	System.out.println(+lpyr+"is a the leap year");
     input.close();
	}
	 }
	
	public static void main(String[] args) {
		 QuestionNo17Calling.calculateleapyear();
	}

}
