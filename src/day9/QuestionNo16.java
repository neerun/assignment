package day9;

import java.util.Scanner;

public class QuestionNo16 {

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int n = input.nextInt();
     
    if (n%2==0){
    	System.out.println("Print even number");
    }
    	else {
    		System.out.println("Print odd number");
    		
    	input.close();
    }
    

	}

}
