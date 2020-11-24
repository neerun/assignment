package day7;

import java.util.Scanner;

public class QuesationNo9 {
	public static void main(String[] args) {
		double p;
		double k;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter kilogram:");
		double kg = input.nextDouble();

		double pu = kg * 0.454;
		System.out.println("1 pu is equal;" + pu);
		input.close();
	}
}
