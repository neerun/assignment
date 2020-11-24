package day9;
import java.util.Scanner;
public class QuestionNo18 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter three values a , b , & c " );
    double a = input.nextDouble();//5
    double b = input.nextDouble();//4
    double c= input.nextDouble();//3 //10
    if (a>b) {
    if (a>c) {
    System.out.println(  " a is largest one");
    
    }
       else 
    	System.out.println("c is greatest one");
  
	}else {	
    System.out.println("b is greatest one.");
    
    }
    
    
	input.close();	
    
	
}
}