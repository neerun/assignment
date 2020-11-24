package day9;

import java.util.Scanner;

public class QuestionNO15 {
	//Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = input.nextInt();
    if (n >= 0 && n <=128) {
    	char c = (char) n;
    	System.out.println("Corresponding ASCII code is:" + c);
    } else {
    	System.out.println("you have entered invalid number");
    }
    input.close();
    	
    }
    	
    		
	}


