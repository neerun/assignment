package day9;

import java.util.Scanner;
//Write a program to relate two integers entered by the user using = =or > or < sign.

public class Questionno14 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter number a");
int a = input.nextInt();
System.out.println("Enter number b");
int b = input.nextInt();
if (a == b ) {
	System.out.println("Print only if a is equal to b");
}
	if (a > b) {
		System.out.println("Print only if a is greater than b");
	}
	if (a < b) {
		System.out.println("Print only if a is smaller than b");
		
		input.close();
 


	
}
}
}