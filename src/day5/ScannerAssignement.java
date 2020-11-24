package day5;

import java.util.Scanner;

public class ScannerAssignement {

	public static void main(String[] args) {
	Scanner input = new Scanner ( System.in);
	System.out.println("Enter Principle");
	int P = input.nextInt();
	System.out.println("Enter time");
	int T = input.nextInt();
	System.out.println("simple interest");
	int I = input.nextInt();
	

	
	int si = (P*T*I) / 100;
	System.out.println("simple intest is " + si);
    input.close();
 

	}

}
