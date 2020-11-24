package day11;

import java.util.Scanner;

public class QuestionNo20calling {

	public static void mathmatic () {
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter the choice");
    int a = input.nextInt();
    
    switch ( a) {
       case 1:
    	   System.out.println("this is addition");
    	break;
    	
       case 2:
    	   System.out.println("this is divison");
    	break;
    	
       case 3:
    	   System.out.println("this is subtraction");
    	break;
    	
       case 4:
    	   System.out.println("this is subtraction");
    	  break;
    	  
    	  default:
    		  System.out.println("this is invalid ");
            break;
           
    }
    input.close();
    }  
    		  public static void main(String[] args) {
    			  QuestionNo20calling.mathmatic ();
    		  }
	}

	
