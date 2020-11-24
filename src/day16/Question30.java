package day16;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fiboncci number");
         int n = input.nextInt();
         
          int a= 1;
          int b = 1;
          int temp;	  
         System.out.println(a+"") ;
         System.out.println(b+"");
         
         for (int i=0; i<=n; i++) {
          temp = a + b;
          b =temp;
         System.out.println(temp+"");
         
        a=b;
        b=temp;
        System.out.println("");
        input.close();
        	
         }	
	}
}
