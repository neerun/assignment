package day16;

import java.util.Scanner;


public class Question25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  no student ");
		int numOstudent =input.nextInt();
		
		int maxScore =0;
		  String studentName = "";
	     
		for (int i =0; i<=numOstudent; i++) {
		System.out.println("Enter name of student ");
	     String name = input.next();
		System.out.println("Enter score of student");
		int score = input.nextInt();
		if(score>maxScore) {
		    maxScore= score;
	      studentName  = name;
		
		}
		}
		System.out.println("Student nam is " + studentName);
		System.out.println("Max score is" + maxScore);
	  input.close();
	
			
			
		
		

	
		
	
		
	}

}
