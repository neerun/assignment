package day11;

import java.util.Scanner;

public class QuestionNo19Calling {

	public static void findAllSidesOfTriangle() {
		
	
    Scanner input = new Scanner("System.in");
    
    System.out.println("Enter first  sides");
    int a = input.nextInt();
    
    System.out.println("Enter second sides");
     int b = input.nextInt();
     
    System.out.println("Enter third sides");
    int c= input.nextInt();
    
    
    if (a==b && b==c) {
    	System.out.println("is a equilateral triangle");
    }
    else if (a==b && b!=c &&  a!= c) {
    	System.out.println("is a isoceles  triangle");
    }
    else {
    	System.out.println("is a scalene triangle");
    }
    input.close();
	}


    public static void main(String[] args) {
    	QuestionNo19Calling.findAllSidesOfTriangle();
    
    }
}