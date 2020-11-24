package day11;

import java.util.Scanner;
// Displaying the largest number from three values.
   public class QuestionNo18Calling {
   public static void findLargestNumber() {
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the number a");
   int a = input.nextInt();
   
   System.out.println("Enter the number b");
   int b = input.nextInt();
   
   System.out.println("Enter the number c");
   int c = input.nextInt();
   
   if (a == b || a >b || a >c) {
	  System.out.println("a is the largest number");}
   
   else if ( b>c || b==a) {
	  System.out.println("b is largest number");}
   
   else {
	   System.out.println("c is the largest number");}
   input.close();
   }
   public static void main(String[] args) { 
	   QuestionNo18Calling.findLargestNumber();
   }
   }
   


   

	






