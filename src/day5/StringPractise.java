package day5;

import java.util.Scanner;

public class StringPractise {

	public static void main(String[] args) {
		
		Scanner ni = new Scanner(System.in);
		
		System.out.println("What is your first name: ");
		String f1= ni.next();
		System.out.println("What is your last name: ");
		String l1= ni.next();
		System.out.println("What is your phone no:");
		String p1 = ni.next();
		System.out.println(" First Last : " + f1 +l1+p1 );
		ni.close();
				
	}
	}

