package day7;

import java.util.Scanner;

public class PerimeterofTriangle {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the area of triangle");
     int a = input.nextInt();
	System.out.println("enter the height of triangle");
	int b = input.nextInt();
    System.out.println("enter the base of triangle");
    int c = input.nextInt();
    int area = a + b + c;
    System.out.println("perimeter of triangle is " + area);
    input.close();
		
}
}