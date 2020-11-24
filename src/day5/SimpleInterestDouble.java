package day5;

import java.util.Scanner;

public class SimpleInterestDouble {

	public static void main(String[] args) {
   
		Scanner input = new Scanner (System.in);
		System.out.println("Enter principle");
		double p = input.nextDouble();
		System.out.println("Enter time");
		double t = input.nextDouble();
		System.out.println("enter rate");
		double r = input.nextDouble();
		double si = (p*t*r)/ 100;
		System.out.println("simple interest is " + si);
		input.close();
	}

}
