          package day7;
          // Changing numbers without using temp
import java.util.Scanner;

public class QuestionNo11b {
          public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter number a ");
          float a = input.nextFloat();
          System.out.println("Enter number  b");
          float b = input.nextFloat();
          
          System.out.println("Before swapping a is" + a);//10
          System.out.println("Before swapping b is" + b);//6
          
           a = a+b;//16
          
           b = a-b;//10
           
           a = a-b;// 6
           
           
           System.out.println("After swapping a is" + a);
           System.out.println("After swappping b is" + b);
          
           input.close(); 
        
          
			
		}
}
