package day7;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the triangle base");
		double base = input.nextDouble();
		System.out.println("Enter the triangle height");
		double height = input.nextDouble();
		double preArea = base *  height;
		double Area = preArea / 2;
		System.out.println(" the area of triangle is " + Area);
		input.close();
	}

}
