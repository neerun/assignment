package day7;

import java.util.Scanner;

public class PerimeterofRectangle {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the lenght of rectangle");
	double length = input.nextDouble();
	System.out.println("enter the weight");
	double weight = input.nextDouble();
	
	 double preimeter = 2 * (length + weight);
	 System.out.println("area of rectangle is" + preimeter);
	 input.close();
	
	}

}
